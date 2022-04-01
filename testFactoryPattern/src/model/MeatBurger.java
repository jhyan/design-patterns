package model;

public class MeatBurger extends Burger {
    public MeatBurger() {
        name = "meatBurger";
        price = 2;
    }

    public void cook() {
        System.out.println("cooking the meat burger");
    }
}
