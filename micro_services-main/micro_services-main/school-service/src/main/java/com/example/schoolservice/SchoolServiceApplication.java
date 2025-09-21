// src/main/java/com/example/schoolservice/SchoolServiceApplication.java
package com.example.schoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SchoolServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(SchoolServiceApplication.class, args);
  }
  @Bean @LoadBalanced RestTemplate restTemplate() { return new RestTemplate(); }
}
