package com.example.drycleaning.repositories;


import com.example.drycleaning.dtos.EmployeeDto;
import com.example.drycleaning.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//    @Query("SELECT e.employee_id, o.date_of_visit, COUNT(o.order_id) FROM Employee e JOIN Orders o ON e.employee_id = o.employee_id WHERE e.employee_id = :employeeId GROUP BY e.employee_id, o.date_of_visit")
//    @Query(value = "SELECT e.id, o.dateOfVisit, COUNT(o.id) " +
//            "FROM Employee e " +
//            "JOIN Order o ON e.id = o.id " +
//            "WHERE e.id = 2 " +
//            "GROUP BY e.id, o.dateOfVisit")
//    List<Object[]> findOrderCountByEmployeeId();
}



