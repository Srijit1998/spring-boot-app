package com.srijit.demo.springboot.service;

import java.util.List;

import com.srijit.demo.springboot.entity.Department;
import com.srijit.demo.springboot.error.DepartmentNotFoundException;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    String deleteDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

}
