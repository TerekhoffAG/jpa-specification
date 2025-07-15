package org.example.jpaspec.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductQueryParam {
    private String name;
    private String category;
    private BigDecimal costTo;
    private BigDecimal costFrom;
}
