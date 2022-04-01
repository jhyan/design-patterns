package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee alice = new Employee("alice", 125000);
        View view = new View();
        Controller controller = new Controller(alice, view);

        controller.update();
        controller.setEmployeeName("bob");
        controller.update();
    }
}
