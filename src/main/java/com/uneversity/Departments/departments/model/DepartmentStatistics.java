package com.uneversity.Departments.departments.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentStatistics {
    private int assistantsCount;
    private int associateProfessorsCount;
    private int professorsCount;
}
