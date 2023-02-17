package com.likelion.practiceaop.service.impl;

import com.likelion.practiceaop.dto.DepartmentDto;
import com.likelion.practiceaop.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto){
        LOGGER.info(departmentDto.toString());
        return departmentDto;
    }
}
