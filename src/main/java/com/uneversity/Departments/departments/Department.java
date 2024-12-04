package com.uneversity.Departments.departments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private long id;
    private String name;
    private long headOfDepartmentId;
}
