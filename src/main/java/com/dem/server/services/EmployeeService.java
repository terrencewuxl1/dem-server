package com.dem.server.services;

import com.dem.server.controller.bean.Employee;
import com.dem.server.controller.jpa.EmployeeRepository;
import com.dem.server.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.size() > 0 ? employeeList : new ArrayList<Employee>();
    }

    public Employee getEmployeeById(Long id) throws RecordNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id.");
        }
    }

    public void createOrUpdateEmployee(Employee employee) {
        Optional<Employee> ordinaryEmployee = employeeRepository.findById(employee.getId());

        if (ordinaryEmployee.isPresent()) {
            Employee newEmployee = ordinaryEmployee.get();
            newEmployee.setEmail(employee.getEmail());
            newEmployee.setFirstName(employee.getFirstName());
            newEmployee.setLastName(employee.getLastName());
            employeeRepository.save(newEmployee);
        } else {
            employeeRepository.save(employee);
        }
    }

    public void deleteEmployeeById(Long id) throws RecordNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id.");
        }
    }
}
