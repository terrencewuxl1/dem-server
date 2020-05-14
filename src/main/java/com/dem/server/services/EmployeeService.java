package com.dem.server.services;

import com.dem.server.entity.Employee;
import com.dem.server.jpa.EmployeeRepository;
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
        return employeeList.size() > 0 ? employeeList : new ArrayList<>();
    }

    public Employee getEmployeeById(Long id) throws RecordNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id.");
        }
    }

    public Employee createOrUpdateEmployee(Employee employee) {
        Optional<Employee> entity = employeeRepository.findById(employee.getId());

        if (entity.isPresent()) {
            Employee curEntity = entity.get();
            curEntity.setEmail(employee.getEmail());
            curEntity.setFirstName(employee.getFirstName());
            curEntity.setLastName(employee.getLastName());

            curEntity = employeeRepository.save(curEntity);

            return curEntity;
        } else {
            employee = employeeRepository.save(employee);

            return employee;
        }
    }

    public void deleteEmployeeById(Long id) throws RecordNotFoundException {
        Optional<Employee> entity = employeeRepository.findById(id);

        if (entity.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id.");
        }
    }
}
