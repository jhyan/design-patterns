package models;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
