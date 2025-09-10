package com.university.Northern_University.controller;

import com.university.Northern_University.entity.Employee;
import com.university.Northern_University.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/emp_create")
    public Employee saveEmployee(@RequestBody Employee employee) {
        // ✅ FIXED: সার্ভিসে employee অবজেক্ট পাঠানো হচ্ছে
        return employeeService.saveEmployee(employee);
    }
}
