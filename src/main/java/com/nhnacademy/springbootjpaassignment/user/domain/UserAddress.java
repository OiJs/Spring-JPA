package com.nhnacademy.springbootjpaassignment.user.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User_Addresses")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "address_detail", nullable = false, length = 500)
    private String addressDetail;
}