package com.dem.server.controller.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employees {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        if(employeeList==null)
            employeeList=new ArrayList<>();
        return employeeList;
    }
}
