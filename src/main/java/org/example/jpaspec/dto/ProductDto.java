package org.example.jpaspec.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductDto {
    private String id;
    private String name;
    private BigDecimal cost;
    private String category;
}
