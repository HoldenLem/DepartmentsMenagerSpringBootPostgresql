package com.uneversity.Departments.lectors;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

@Entity
@Table(name = "user_table")
public class Lector {
    @Id
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private double salary;
    private long departmentId;
    @Enumerated(EnumType.STRING)
    private AcademicDegree academicDegree;

}
