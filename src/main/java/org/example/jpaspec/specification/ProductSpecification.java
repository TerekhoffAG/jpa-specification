package org.example.jpaspec.specification;

import org.example.jpaspec.entity.ProductEntity;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.util.function.Function;

public class ProductSpecification {

    public static Function<String, Specification<ProductEntity>> productNameLike = (String nameLike) ->
            (root, query, cb) ->
                    cb.like(cb.lower(root.get("name")), "%" + nameLike.toLowerCase() + "%");

    public static Function<String, Specification<ProductEntity>> productCode = (String code) ->
            (root, query, cb) -> cb.equal(root.get("category").get("code"), code);

    public static Function<BigDecimal, Specification<ProductEntity>> productCostFrom = (BigDecimal costFrom) ->
            (root, query, cb) -> cb.ge(root.get("cost"), costFrom);

    public static Function<BigDecimal, Specification<ProductEntity>> productCostTo = (BigDecimal costTo) ->
            (root, query, cb) -> cb.le(root.get("cost"), costTo);
}
