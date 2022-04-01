package models;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class VanilaIceCream extends IceCreamDecorator {
    public VanilaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
