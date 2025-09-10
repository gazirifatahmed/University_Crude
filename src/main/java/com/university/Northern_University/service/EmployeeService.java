package com.university.Northern_University.service;

import com.university.Northern_University.entity.Employee;
import com.university.Northern_University.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    // ✅ FIXED: এখন প্যারামিটার নেয় এবং ছোট হাতের save() ব্যবহার করে
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
