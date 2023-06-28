package com.osi.microservicesdemo1.deptservise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osi.microservicesdemo1.deptservise.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
