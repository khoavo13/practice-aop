package com.likelion.practiceaop.service.impl;

import com.likelion.practiceaop.dto.EmployeeDto;
import com.likelion.practiceaop.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto){
        LOGGER.info(employeeDto.toString());
        return employeeDto;
    }
}
