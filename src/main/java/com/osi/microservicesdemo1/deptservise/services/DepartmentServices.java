package com.osi.microservicesdemo1.deptservise.services;

import com.osi.microservicesdemo1.deptservise.entity.Department;

public interface DepartmentServices {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
