package com.company;

public class Main {

    public static void main(String[] args) {
        Expression exp1 = new TerminalExpression("male");
        Expression exp2 = new TerminalExpression("bob");

        AndExpression andExpression = new AndExpression(exp1, exp2);
        System.out.println(andExpression.interpret("bob, male"));
    }
}
