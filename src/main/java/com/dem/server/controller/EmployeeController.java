package com.dem.server.controller;

import com.dem.server.controller.bean.Employee;
import com.dem.server.exception.RecordNotFoundException;
import com.dem.server.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<List<Employee>>(employeeList, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
        Employee employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<Employee>(employee, new HttpHeaders(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Employee> createOrUpdateEmployee(Employee employee) {
        employeeService.createOrUpdateEmployee(employee);
        return new ResponseEntity<Employee>(employee, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("{/id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
        employeeService.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }

}
