package com.dem.server.controller;

import com.dem.server.controller.bean.Employee;
import com.dem.server.controller.bean.Employees;
import com.dem.server.controller.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(path="/all")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);

        employeeDao.addEmployee(employee);
        System.out.println(employeeDao.getAllEmployees().getEmployeeList().size());

        URI location =
                ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("{/id}")
                        .buildAndExpand(employee.getId())
                        .toUri();

        return ResponseEntity.created(location).build();
    }

}
