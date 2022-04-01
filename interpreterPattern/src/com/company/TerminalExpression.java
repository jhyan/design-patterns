package com.company;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String input) {
        if (input.toLowerCase().contains(this.data)) {
            return true;
        }
        return false;
    }
}
