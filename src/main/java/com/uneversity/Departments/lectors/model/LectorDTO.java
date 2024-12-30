package com.uneversity.Departments.lectors.model;

import com.uneversity.Departments.lectors.AcademicDegree;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LectorDTO {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private double salary;
    private long departmentId;
    private AcademicDegree academicDegree;


    @Override
    public String toString() {
        return  firstName + " "  + lastName + '\'' +
               " email='" + email + '\'' +
               ", salary=" + salary +
               ", departmentId=" + departmentId +
               ", academicDegree=" + academicDegree ;
    }
}
