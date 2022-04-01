package com.company;

public class ChocolateIceCream extends IceCreamDecorator{

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String toString() {
        return "cost: " + this.cost();
    }
}
