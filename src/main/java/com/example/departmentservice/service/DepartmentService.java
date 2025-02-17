package com.example.departmentservice.service;

import com.example.departmentservice.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}