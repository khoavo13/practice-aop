package com.likelion.practiceaop.controller;

import com.likelion.practiceaop.dto.EmployeeDto;
import com.likelion.practiceaop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/test")
public class TestEmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        employeeService.getEmployeeDto(employeeDto);
        return new ResponseEntity<>(employeeDto, HttpStatus.CREATED);
    }
}
