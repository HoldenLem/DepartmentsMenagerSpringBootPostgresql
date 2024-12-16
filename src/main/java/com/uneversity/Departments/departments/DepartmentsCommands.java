package com.uneversity.Departments.departments;

import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;


@RequiredArgsConstructor
@Command(group = "Customer Commands")
public class DepartmentsCommands {

    private final DepartmentFacade departmentFacade;

    @Command(command = "departments head ", description = "Finds the Head of a Department by Name")
    String findHeadBy(@Option(required = true, description = "The department name") final String departmentName) {
        final HeadOfDepartment head = departmentFacade.findBy(departmentName);
        return String.format("Head of %s department is %s %s", departmentName, head.getFirstName(), head.getLastName());

    }

}
