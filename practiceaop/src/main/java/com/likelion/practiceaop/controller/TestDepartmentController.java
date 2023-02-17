package com.likelion.practiceaop.controller;

import com.likelion.practiceaop.dto.DepartmentDto;
import com.likelion.practiceaop.service.DepartmentService;
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
public class TestDepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public ResponseEntity<DepartmentDto> createEmployee(@Valid @RequestBody DepartmentDto departmentDto){
        departmentService.getDepartmentDto(departmentDto);
        return new ResponseEntity<>(departmentDto, HttpStatus.CREATED);
    }
}
