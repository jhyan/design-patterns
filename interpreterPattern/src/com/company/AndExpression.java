package com.company;

public class AndExpression implements Expression{
    Expression exp1;
    Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String data) {
        if (this.exp1.interpret(data) && this.exp2.interpret(data)) {
            return true;
        }
        return false;
    }
}
