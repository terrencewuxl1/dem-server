package com.dem.server.test;

import com.dem.server.jpa.EmployeeRepository;
import com.dem.server.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = {EmployeeService.class,
        EmployeeRepository.class})
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;
}
