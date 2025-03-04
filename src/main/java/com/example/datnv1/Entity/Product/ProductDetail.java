package com.example.datnv1.Entity.Product;

import com.example.datnv1.Entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends BaseEntity {

    @Column
    private String productDetailName;

    @Column
    private Long quantity;

    @Column
    private Float weight;

    @Column
    private Float sum;

    @Column
    private Float price;

    @OneToMany(mappedBy = "productDetail")
    private Set<ProductDetailBatch> productDetailBatches = new HashSet<ProductDetailBatch>();


}
