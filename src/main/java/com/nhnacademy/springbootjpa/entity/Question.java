package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

// TODO #1: `question` 테이블과 매핑될 `Question` Entity 클래스를 작성하세요.
/*
 * create table question
 * (
 *     id         bigint auto_increment
 *         primary key,
 *     title      varchar(100) not null,
 *     content    text         not null,
 *     created_at datetime     not null
 * );
 */
@Getter
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    private ZonedDateTime createdAt;

    public Question(String title, String content, ZonedDateTime createdAt) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }
}
