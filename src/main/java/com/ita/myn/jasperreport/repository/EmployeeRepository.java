package com.ita.myn.jasperreport.repository;

import com.ita.myn.jasperreport.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
