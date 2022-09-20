package com.demo.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(DepartmentServiceApplication.class, args);
        System.out.println("Welcome to department service");
    }

}
