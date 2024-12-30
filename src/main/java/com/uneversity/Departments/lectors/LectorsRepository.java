package com.uneversity.Departments.lectors;

import com.uneversity.Departments.departments.model.DepartmentStatistics;
import com.uneversity.Departments.lectors.model.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    HeadOfDepartment findBy(String departmentName);

    @Query(
            value = """
                    SELECT
                    COUNT(*) as lectorsCount,
                    COUNT(CASE WHEN l.degree = 'ASSISTANT' THEN 1 END) as assistantsCount,
                    COUNT(CASE WHEN l.degree = 'ASSOCIATE_PROFESSOR' THEN 1 END) as associateProfessorsCount,
                    COUNT(CASE WHEN l.degree = 'PROFESSOR' THEN 1 END) as professorsCount
                    FROM lectors l
                    WHERE l.department_id =  (
                         SELECT d.id
                         FROM departments d
                         WHERE LOWER(d.name) = LOWER(:departmentName)
                     )
                    """,
            nativeQuery = true
    )
    DepartmentStatistics getBy(String departmentName);

    @Query(
            value = """
                    SELECT
                    AVG(l.salary) as averageSalary
                    FROM lectors l
                    WHERE l.department_id =  (
                         SELECT d.id
                         FROM departments d
                         WHERE LOWER(d.name) = LOWER(:departmentName)
                     )
                    """,
            nativeQuery = true
    )
    int averageSalary(String departmentName);

    @Query(
            value = """
                    SELECT
                    COUNT(*) as lectorsCount
                    FROM lectors l
                    WHERE l.department_id =  (
                         SELECT d.id
                         FROM departments d
                         WHERE LOWER(d.name) = LOWER(:departmentName)
                     )
                    """,
            nativeQuery = true
    )
    int countBy(String departmentName);

    @Query(
            value = """
                SELECT *
                FROM lectors
                WHERE LOWER(first_name) LIKE '%' || LOWER(:template) || '%'
                OR LOWER(last_name) LIKE '%' || LOWER(:template) || '%';
                """,
            nativeQuery = true
    )
    List<Lector> searchBy(String template);

}
