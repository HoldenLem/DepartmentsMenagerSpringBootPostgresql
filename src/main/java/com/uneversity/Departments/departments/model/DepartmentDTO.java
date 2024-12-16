package com.uneversity.Departments.departments.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class DepartmentDTO {
    private long id;
    private long facultyId;
    private long headOfDepartmentId;
}
