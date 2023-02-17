package com.likelion.practiceaop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private long departmentId;
    @NotBlank(message = "Department name is empty!")
    @Size(min = 10, max = 50, message = "Input string must be between 10 and 50 characters!")
    private String deptName;
    @NotBlank(message = "Description is empty!")
    private String description;
    @Valid
    private List<EmployeeDto> employeeDtos;
}
