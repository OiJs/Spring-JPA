package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Enrollment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO #4: Enrollment Entity에 대한 Repository interface
//          Enrollment Entity 매핑 내용에 따라 interface 를 수정하세요.
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findAllByStudent_Name(String studentName);

    List<Enrollment> findAllByCourse_Name(String courseName);

}
