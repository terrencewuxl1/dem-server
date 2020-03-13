package com.dem.server.controller.dao;

import com.dem.server.controller.bean.Employee;
import com.dem.server.controller.bean.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    private static Employees employees = new Employees();

    static {
        employees.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        employees.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        employees.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
