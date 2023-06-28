package com.osi.microservicesdemo1.deptservise.services.impl;


import org.springframework.stereotype.Service;

import com.osi.microservicesdemo1.deptservise.entity.Department;
import com.osi.microservicesdemo1.deptservise.repository.DepartmentRepository;
import com.osi.microservicesdemo1.deptservise.services.DepartmentServices;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentServices {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
