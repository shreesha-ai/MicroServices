// src/main/java/com/example/studentservice/repo/StudentRepository.java
package com.example.studentservice.repo;

import com.example.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
