package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.OrderItem;
import com.nhnacademy.springbootjpa.entity.OrderItemPk;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
    Optional<OrderItem> findById(OrderItemPk pk);
}
