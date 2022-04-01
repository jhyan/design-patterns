package model;

public class SFStore extends BurgerStore {
    @Override
    public Burger createBurger(Class c) {
        System.out.println("SFStore is making burgers!");
        Burger burger = null;
        try {
            burger = (Burger) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return burger;
    }
}
