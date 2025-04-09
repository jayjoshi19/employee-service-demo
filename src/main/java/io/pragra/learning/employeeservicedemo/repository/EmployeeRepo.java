package io.pragra.learning.employeeservicedemo.repository;

import io.pragra.learning.employeeservicedemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
