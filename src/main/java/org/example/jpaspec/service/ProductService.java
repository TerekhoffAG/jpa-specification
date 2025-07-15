package org.example.jpaspec.service;

import lombok.RequiredArgsConstructor;
import org.example.jpaspec.dto.ProductQueryParam;
import org.example.jpaspec.entity.ProductEntity;
import org.example.jpaspec.repository.ProductRepository;
import org.example.jpaspec.specification.ProductSpecification;
import org.example.jpaspec.specification.SpecificationCollector;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository prodRepository;

    public List<ProductEntity> getProducts(ProductQueryParam param) {
        return prodRepository.findAll(
                SpecificationCollector.and(
                        Arrays.asList(
                                SpecificationCollector.map(param.getName(), ProductSpecification.productNameLike),
                                SpecificationCollector.map(param.getCategory(), ProductSpecification.productCode),
                                SpecificationCollector.map(param.getCostTo(), ProductSpecification.productCostTo),
                                SpecificationCollector.map(param.getCostFrom(), ProductSpecification.productCostFrom)
                        )
                )
        );
    }
}
