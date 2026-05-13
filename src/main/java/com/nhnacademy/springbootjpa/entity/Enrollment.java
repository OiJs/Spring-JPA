package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.ZonedDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

// TODO #3: `enrollment` 테이블과 매핑될 `Enrollment` Entity 클래스
//           Entity 매핑과 연관관계 매핑을 하세요.
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Enrollment {
    @Id
    private Long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

    @CreatedDate
    private ZonedDateTime enrolledAt;

    public Enrollment(Student student, Course course, ZonedDateTime enrolledAt) {
        this.student = student;
        this.course = course;
        this.enrolledAt = enrolledAt;
    }
}
