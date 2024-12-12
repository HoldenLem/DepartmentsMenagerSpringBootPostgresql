package com.uneversity.Departments.lectors;

import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LectorsRepository extends JpaRepository<Lector, String> {

    @Query(
            value = """
                     SELECT
                     l.first_name AS firstName,
                     l.last_name AS lastName
                     FROM lectors l
                     WHERE l.id = (
                         SELECT d.head
                         FROM departments d
                         WHERE LOWER(d.name) = LOWER(:departmentName)
                     )
                    """,
            nativeQuery = true
    )
    HeadOfDepartment findBy(String departmentName, long lectorId);

}
