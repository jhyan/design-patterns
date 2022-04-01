package com.company;

// view doesn't hold the model, it uses it as an argument for here
public class View {
    void displayEmployeeInformation(Employee employee) {
        System.out.println(employee.getName() + " : " + employee.getSalary() + " salary");
    }

}
