package com.uneversity.Departments.departments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface DepartmentsRepository extends JpaRepository<Department, String> {
    @Query("SELECT d FROM Department d WHERE LOWER(d.name) = LOWER(:name)")
    Optional<Department> findBy(String name);
}
