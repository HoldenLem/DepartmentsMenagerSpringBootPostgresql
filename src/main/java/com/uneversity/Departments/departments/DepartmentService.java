package com.uneversity.Departments.departments;

import com.uneversity.Departments.lectors.LectorsRepository;
import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentsRepository repo;
    private final LectorsRepository lectorsRepo;

    public Optional<Department> getDBy(String name) {
        return repo.findBy(name);
    }

    public HeadOfDepartment getHeadOfDepartment(String departmentName, long lectorId) {
        return lectorsRepo.findBy(departmentName, lectorId);
    }

}
