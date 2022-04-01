package model;

import java.util.Arrays;
import java.util.List;

public class Pant implements Visitable {
    private double price;

    public Pant(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
