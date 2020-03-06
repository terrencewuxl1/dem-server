package com.dem.server.controller.bean;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList == null ? new ArrayList<>() : employeeList;
    }
}
