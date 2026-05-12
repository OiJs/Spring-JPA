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

// TODO #2: `answer` 테이블과 매핑될 `Answer` Entity 클래스를 작성하세요.
/*
 * create table answer
 * (
 *     id          bigint auto_increment
 *         primary key,
 *     question_id bigint   not null,
 *     content     text     not null,
 *     created_at  datetime not null
 * );
 */
@Getter
@NoArgsConstructor
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_id", nullable = false)
    private Long questionId;
    @Column(name = "content", nullable = false,columnDefinition = "TEXT")
    private String content;
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;


    public Answer(Long questionId, String content, ZonedDateTime createdAt) {
        this.questionId = questionId;
        this.content = content;
        this.createdAt = createdAt;
    }
}
