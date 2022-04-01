package model;


public class VegieBurger extends Burger {

    public VegieBurger() {
        price = 1;
        name = "vegie burger";
    }

    public void cook() {
        System.out.println("cooking the vegie burger");
    }
}