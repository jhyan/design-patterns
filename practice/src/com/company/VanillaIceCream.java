package com.company;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }

    @Override
    public String toString() {
        return "cost: " + this.cost();
    }
}
