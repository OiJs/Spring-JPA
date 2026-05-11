package com.nhnacademy.springbootjpaassignment.order.domain;

import com.nhnacademy.springbootjpaassignment.product.domain.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Order_Details")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Integer detailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id") 
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price", nullable = false)
    private Integer unitPrice;
}