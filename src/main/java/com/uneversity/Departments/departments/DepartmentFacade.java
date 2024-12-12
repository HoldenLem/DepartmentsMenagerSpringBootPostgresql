package com.uneversity.Departments.departments;

import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DepartmentFacade {
    private final DepartmentService service;

    public HeadOfDepartment findBy(String name) {
        var department = service.getDBy(name).orElseThrow(
                () -> new
                        IllegalArgumentException("Department not found")
        );
        return service.getHeadOfDepartment(name, department.getHeadOfDepartmentId());
    }

}
