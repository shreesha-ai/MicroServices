// src/main/java/com/example/studentservice/web/StudentController.java
package com.example.studentservice.web;

import com.example.studentservice.model.Student;
import com.example.studentservice.repo.StudentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
  private final StudentRepository repo;
  public StudentController(StudentRepository repo) { this.repo = repo; }

  @GetMapping public List<Student> all() { return repo.findAll(); }
  @PostMapping public Student create(@RequestBody Student s) { return repo.save(s); }
  @GetMapping("/{id}") public Student one(@PathVariable Long id) { return repo.findById(id).orElse(null); }
}
