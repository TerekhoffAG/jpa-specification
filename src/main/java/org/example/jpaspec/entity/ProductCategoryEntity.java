package org.example.jpaspec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_category")
public class ProductCategoryEntity {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;
}
