package com.epam.repository;

import com.epam.model.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(int id);
}
