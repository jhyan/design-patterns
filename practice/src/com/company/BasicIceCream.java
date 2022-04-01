package com.company;

public class BasicIceCream implements IceCream{
    private String name;

    public BasicIceCream(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
