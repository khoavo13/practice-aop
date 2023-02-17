package com.likelion.practiceaop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private long Employeeid;
    @NotBlank(message = "Employee name is empty!")
    @Size(min = 10, max = 50, message = "Input string must be between 10 and 50 characters!")
    private String name;
    private String birthDate;
    private boolean gender;
    @NotBlank
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@gmail.com$", message = "Email is invalid!")
    private String email;
}
