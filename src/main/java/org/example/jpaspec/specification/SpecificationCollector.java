package org.example.jpaspec.specification;

import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class SpecificationCollector {
    public static <T> Specification<T> and(List<Specification<T>> specs) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.and(
                specs.stream()
                        .filter(Objects::nonNull)
                        .map(spec -> spec.toPredicate(root, query, criteriaBuilder))
                        .toArray(Predicate[]::new)
        );
    }

    public static <R, V> Specification<R> map(V value, Function<V, Specification<R>> mapper) {
        return Optional.ofNullable(value)
                .map(mapper)
                .orElse(null);
    }
}