package com.ita.myn.jasperreport.controller;

import com.ita.myn.jasperreport.entity.Employee;
import com.ita.myn.jasperreport.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById("id");
    }

    @PutMapping("employee/{id}")
    public Employee updateEmployee(@PathVariable("id") String id, @RequestBody  Employee employee){
        return null;
    }

    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        return;
    }
}
