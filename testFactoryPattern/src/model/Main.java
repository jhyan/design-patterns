package model;

public class Main {
    public static void main(String[] args) {
        SFStore sfStore = new SFStore();
        SeattleStore seattleStore = new SeattleStore();

        Burger burger = sfStore.orderBurger(VegieBurger.class);
        System.out.println("sf store cooked burger: " + burger.name);

        burger = seattleStore.orderBurger(MeatBurger.class);
        System.out.println("seattle store cooked burger: " + burger.name);
    }
}
