package com.uneversity.Departments.departments;

import com.uneversity.Departments.departments.model.DepartmentStatistics;
import com.uneversity.Departments.lectors.LectorsRepository;
import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
class DepartmentService {
    private final LectorsRepository lectorsRepo;
    private final DepartmentsRepository departmentRepo;

    HeadOfDepartment getHeadOfDepartment(String departmentName) {
        return lectorsRepo.findBy(departmentName);
    }

    DepartmentStatistics getBy(String departmentName) {
        return lectorsRepo.getBy(departmentName);
    }

    int averageSalary(String departmentName) {
        return lectorsRepo.averageSalary(departmentName);
    }

    int countEmployees(String departmentName) {
        return lectorsRepo.countBy(departmentName);
    }

    boolean presentBy(String departmentName) {
        return !departmentRepo.existsByNameIgnoreCase(departmentName);
    }
}
