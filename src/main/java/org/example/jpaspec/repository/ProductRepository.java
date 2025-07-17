package org.example.jpaspec.repository;

import org.example.jpaspec.entity.ProductEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends
        JpaRepository<ProductEntity, UUID>,
        JpaSpecificationExecutor<ProductEntity> {

    @Override
    @EntityGraph(attributePaths = {"category"}, type = EntityGraph.EntityGraphType.LOAD)
    List<ProductEntity> findAll(@Nullable Specification<ProductEntity> spec);
}
