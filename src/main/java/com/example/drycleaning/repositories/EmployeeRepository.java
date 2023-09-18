package com.example.drycleaning.repositories;

import com.example.drycleaning.dtos.EmployeeOutDto;
import com.example.drycleaning.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("SELECT e.id, e.human.firstName, e.human.lastName, COUNT(o.id) AS orderCount, SUM(o.cost) AS totalCost, e.salary " +
            "FROM Employee e " +
            "LEFT JOIN e.order o " +
            "WHERE e.id = :employeeId " +
            "GROUP BY e.id, e.human.firstName, e.human.lastName, e.salary")
    EmployeeOutDto findEmployeeByOrder(@Param("employeeId") Integer employeeId);

}



