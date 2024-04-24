package com.ita.myn.jasperreport.service;

import com.ita.myn.jasperreport.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String id);

}
