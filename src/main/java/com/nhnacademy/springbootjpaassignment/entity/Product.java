package com.nhnacademy.springbootjpaassignment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Products")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", nullable = false, length = 200)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private Integer productPrice;

    @Column(name = "product_stock", nullable = false)
    private Integer productStock;

    @Lob
    @Column(name = "thumb_image", columnDefinition = "LONGTEXT")
    private String thumbImage;

    @Lob
    @Column(name = "detail_image", columnDefinition = "LONGTEXT")
    private String detailImage;

    @Column(name = "thumb_image_type", nullable = false, length = 100)
    private String thumbImageType;

    @Column(name = "detail_image_type", nullable = false, length = 100)
    private String detailImageType;
}