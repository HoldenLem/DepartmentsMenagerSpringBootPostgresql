package com.uneversity.Departments.departments;

import com.uneversity.Departments.departments.model.DepartmentStatistics;
import com.uneversity.Departments.exception.DepartmentNotFoundException;
import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@RequiredArgsConstructor
class DepartmentFacade {
    private final DepartmentService service;

    HeadOfDepartment findBy(String name) {
        return Optional.ofNullable(service.getHeadOfDepartment(name))
                .orElseThrow(() -> new DepartmentNotFoundException("No head found for the " + name + " department"));
    }

    DepartmentStatistics getStatisticsBy(String name) {
        checkDepartmentPresence(name);
        return service.getBy(name);
    }

    int getAverageSalary(String name) {
        checkDepartmentPresence(name);
        return service.averageSalary(name);
    }

    int countEmployees(String name) {
        checkDepartmentPresence(name);
        return service.countEmployees(name);
    }

    private void checkDepartmentPresence(String name) {
        if (service.presentBy(name)) {
            throw new DepartmentNotFoundException("No department found for the " + name + " name");
        }
    }
}
