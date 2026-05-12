package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

// TODO #2: `Locker` Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Locker {
    @Id
    private long id;

    @Setter
    @NotNull
    private String name;

    @OneToOne(mappedBy = "locker")
    private Member member;
}
