package com.nhnacademy.springbootjpaassignment.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public enum Auth{
        ROLE_ADMIN,ROLE_USER
    }
    @Id
    @Column(name = "user_id", length = 50)
    private Long userId;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "user_password", nullable = false, length = 200)
    private String userPassword;

    @Column(name = "user_birth", nullable = false, length = 8)
    private String userBirth;

    @Column(name = "user_auth", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private Auth userAuth;

    @Column(name = "user_point", nullable = false)
    private Integer userPoint = 1000000;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "latest_login_at")
    private LocalDateTime latestLoginAt;
}