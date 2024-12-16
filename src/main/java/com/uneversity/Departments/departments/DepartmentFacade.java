package com.uneversity.Departments.departments;

import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
class DepartmentFacade {
    private final DepartmentService service;

    HeadOfDepartment findBy(String name) {
        return service.getHeadOfDepartment(name);
    }

}
