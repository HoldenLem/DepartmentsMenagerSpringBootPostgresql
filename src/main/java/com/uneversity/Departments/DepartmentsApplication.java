package com.uneversity.Departments;

import com.uneversity.Departments.departments.DepartmentsCommands;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@EnableCommand(DepartmentsCommands.class)
public class DepartmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentsApplication.class, args);
	}

}
