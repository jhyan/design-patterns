package com.company;

public class Main {
    public static void main(String[] args) {
        BasicIceCream basic = new BasicIceCream("cool icecream");
        ChocolateIceCream chocolateIceCream = new ChocolateIceCream(basic);
        VanillaIceCream vanillaIceCream = new VanillaIceCream(chocolateIceCream);

        System.out.println(chocolateIceCream);
        System.out.println(vanillaIceCream);
    }
}
