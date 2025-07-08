package com.example.ormlearn;

import com.example.ormlearn.model.Employee;
import com.example.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = employeeService.getAllPermanentEmployees();
        employees.forEach(e -> {
            System.out.println("Employee: " + e.getName());
            System.out.println("Department: " + e.getDepartment().getName());
            System.out.println("Skills: " + e.getSkillList());
        });
    }
}
