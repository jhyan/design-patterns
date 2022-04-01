package model;

public abstract class Burger {
    public float price;
    public String name;

    public void cook() {
        System.out.println("Cooking original burger");
    }

    public void box() {
        System.out.println("boxing original burger");
    }
}
