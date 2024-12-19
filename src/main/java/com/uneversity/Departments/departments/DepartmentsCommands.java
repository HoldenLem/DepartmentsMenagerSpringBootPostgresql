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

    @Command(command = "departments statistics ", description = "Finds the statistics of a Department by Name")
    String getBy(@Option(required = true,description = "The department name") final String departmentName) {
        final var statistics = departmentFacade.getStatisticsBy(departmentName);
        return String.format("Department %s, %d assistants, %d associate professors, %d professors",
                departmentName, statistics.getAssistantsCount(), statistics.getAssociateProfessorsCount(), statistics.getProfessorsCount());
    }

    @Command(command = "departments averageSalary ", description = "Finds the average salary of a Department by Name")
    String averageSalary(@Option(required = true, description = "The department name") final String departmentName) {
        final var averageSalary = departmentFacade.getAverageSalary(departmentName);
        return String.format("The average salary of %s department is %d", departmentName, averageSalary);
    }

}
