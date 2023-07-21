package com.csi.controller;

import com.csi.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("WELCOME TO FINTECH CSI PUNE");
    }

    @GetMapping("/listofemployee")
    public ResponseEntity<List<Employee>> getAllData() {
        return ResponseEntity.ok(Stream.of(new Employee(121, "SWARA", 65000),
                new Employee(122, "RAM", 95000),
                new Employee(123, "VENKAT", 75000),
                new Employee(124, "SURAJ", 85000),
                new Employee(129, "VEDANT", 65000)
        ).collect(Collectors.toList()));
    }
}
