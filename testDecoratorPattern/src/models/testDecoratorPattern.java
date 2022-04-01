package models;

import interfaces.BasicIceCream;

public class testDecoratorPattern {
    public static void main(String[] args) {
        BasicIceCream basicIceCream = new BasicIceCream();
        System.out.println("basic icecream cost: " + basicIceCream.cost());
        ChocolateIceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        System.out.println("chocolate icecream costs: " + chocolateIceCream.cost());

        VanilaIceCream vanilaWithChocolateIcecream = new VanilaIceCream(chocolateIceCream);
        System.out.println("chocolate vanilla icecream costs: " + vanilaWithChocolateIcecream.cost());
    }
}
