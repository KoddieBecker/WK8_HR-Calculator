package com.tejoko.Data;

import com.tejoko.Model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDB {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee (Employee employee) {
        employeeList.add(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    public Employee findEmpByID(String empID) {
        for (Employee employee:employeeList) {
            if (employee.getEmpdId().equalsIgnoreCase(empID)){
                return employee;
            }
        }
        return null;
    }
    public Employee findEmpByPos(String empPos) {
        for (Employee employee:employeeList) {
            if (employee.getEmpPos().equalsIgnoreCase(empPos)){
                return employee;
            }
        }
        return null;
    }

}