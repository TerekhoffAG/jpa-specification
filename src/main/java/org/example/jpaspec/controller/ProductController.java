package org.example.jpaspec.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpaspec.dto.ProductDto;
import org.example.jpaspec.dto.ProductQueryParam;
import org.example.jpaspec.entity.ProductEntity;
import org.example.jpaspec.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    ResponseEntity<List<ProductDto>> query(@ModelAttribute ProductQueryParam queryParam) {
        List<ProductEntity> products = productService.getProducts(queryParam);

        return ResponseEntity.ok(
                products.stream()
                        .map(product ->
                                ProductDto.builder()
                                        .id(product.getId().toString())
                                        .name(product.getName())
                                        .cost(product.getCost())
                                        .category(product.getCategory().getName())
                                        .build())
                        .toList()
        );
    }
}