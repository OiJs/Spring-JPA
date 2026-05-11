package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

// TODO #1: `item` 테이블과 매핑될 `Item` Entity 클래스를 작성하세요.
/*
 * create table item
 * (
 *     id    bigint auto_increment
 *         primary key,
 *     name  varchar(40) not null,
 *     price bigint      not null
 * );
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(max = 40)
    @NotNull
    private String name;
    @NotNull
    @Min(0)
    private Long price;
}
