package com.jpa.jpa_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.kamilo.hibernate.modelo")
public class JpaH2Application {

  public static void main(String[] args) {
    SpringApplication.run(JpaH2Application.class, args);

  }

}
