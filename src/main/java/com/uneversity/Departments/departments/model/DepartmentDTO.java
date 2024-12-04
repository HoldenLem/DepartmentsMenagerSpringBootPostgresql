package com.uneversity.Departments.departments.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private long id;
    private long facultyId;
    private long headOfDepartmentId;
}
