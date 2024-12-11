package com.uneversity.Departments.departments;

import org.springframework.shell.command.annotation.Command;


@Command(group = "Customer Commands")
public class DepartmentsCommands {

    @Command(command="find-customer",
            description="Finds a Customer By Id")
    public String whoIsHeadOfDepartment() {

        return "Head of department is ";
    }
}
