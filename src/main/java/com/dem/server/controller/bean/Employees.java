package com.dem.server.controller.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employees {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return this.employeeList == null ? new ArrayList<>() : employeeList;
    }
}
