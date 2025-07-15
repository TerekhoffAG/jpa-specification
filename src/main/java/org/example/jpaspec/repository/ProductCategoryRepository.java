package org.example.jpaspec.repository;

import org.example.jpaspec.entity.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends
        JpaRepository<ProductCategoryEntity, String>,
        JpaSpecificationExecutor<ProductCategoryEntity> {
}
