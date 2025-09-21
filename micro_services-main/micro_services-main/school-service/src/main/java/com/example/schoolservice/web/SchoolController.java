// src/main/java/com/example/schoolservice/web/SchoolController.java
package com.example.schoolservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
  private final RestTemplate restTemplate;
  private final String studentServiceUrl;

  public SchoolController(RestTemplate restTemplate,
                          @Value("${student.service.url}") String studentServiceUrl) {
    this.restTemplate = restTemplate;
    this.studentServiceUrl = studentServiceUrl;
  }

  @GetMapping("/students")
  public List<?> getStudents() {
    return restTemplate.getForObject(studentServiceUrl, List.class);
  }
}
