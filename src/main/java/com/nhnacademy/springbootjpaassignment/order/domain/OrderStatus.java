package com.nhnacademy.springbootjpaassignment.order.domain;

import lombok.Getter;

@Getter
public enum OrderStatus {
    WAITING_PAYMENT("결제대기"),
    COMPLETED_PAYMENT("결제완료"),
    PREPARING_PRODUCT("상품준비중"),
    SHIPPING("배송중"),
    DELIVERED("배송완료"),
    CANCELED("주문취소"),
    RETURNED("반품완료");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public boolean isCancelable() {
        return this == WAITING_PAYMENT || this == COMPLETED_PAYMENT || this == PREPARING_PRODUCT;
    }

    public boolean isReturnable() {
        return this == DELIVERED;
    }
}