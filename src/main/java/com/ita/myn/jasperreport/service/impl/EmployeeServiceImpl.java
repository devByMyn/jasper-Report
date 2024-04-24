package com.ita.myn.jasperreport.service.impl;

import com.ita.myn.jasperreport.entity.Employee;
import com.ita.myn.jasperreport.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

}
