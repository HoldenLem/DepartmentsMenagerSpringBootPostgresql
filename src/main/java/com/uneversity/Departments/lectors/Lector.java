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
@ToString

@Entity
@Table(name = "lectors")
public class Lector {
    @Id
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private double salary;
    @Enumerated(EnumType.STRING)
    private AcademicDegree degree;
    private long departmentId;

}
