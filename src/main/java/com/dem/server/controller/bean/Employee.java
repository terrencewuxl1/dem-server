package com.dem.server.controller.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
