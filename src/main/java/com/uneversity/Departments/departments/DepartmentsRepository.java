package com.uneversity.Departments.departments;

import com.uneversity.Departments.departments.model.DepartmentStatistics;
import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface DepartmentsRepository extends JpaRepository<Department, String> {

}
