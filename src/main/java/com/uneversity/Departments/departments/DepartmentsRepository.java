package com.uneversity.Departments.departments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DepartmentsRepository extends JpaRepository<Department, String> {
    boolean existsByNameIgnoreCase(String departmentName);
}
