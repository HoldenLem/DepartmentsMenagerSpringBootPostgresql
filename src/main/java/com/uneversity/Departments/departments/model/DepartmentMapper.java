package com.uneversity.Departments.departments.model;

import com.uneversity.Departments.departments.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
   DepartmentDTO of(Department department);
    Department of(DepartmentDTO departmentDTO);
}
