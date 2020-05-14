package com.dem.server.test;

import com.dem.server.controller.EmployeeController;
import com.dem.server.controller.bean.Employee;
import com.dem.server.controller.jpa.EmployeeRepository;
import com.dem.server.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = EmployeeController.class)
@Import(EmployeeService.class)
public class EmployeeControllerTest {

    @MockBean
    EmployeeRepository employeeRepository;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void createEmployee(){
        Employee employee = new Employee();
        employee.setFirstName("testFirst");
        employee.setLastName("testLast");
        employee.setEmail("test@gmail.com");

        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

//        webTestClient.post()
//                .uri("/")
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters)

    }
}
