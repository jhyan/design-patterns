package com.company;

public class Controller {
    public Employee employee;
    public View view;

    public Controller(Employee employee, View view) {
        this.view = view;
        this.employee = employee;
    }

    public void update() {
        this.view.displayEmployeeInformation(employee);
    }

    public void setEmployeeName(String name) {
        this.employee.setName(name);
    }

    public void setEmployeeSalary(double salary) {
        this.employee.setSalary(salary);
    }

}
