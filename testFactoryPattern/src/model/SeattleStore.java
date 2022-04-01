package model;

import java.lang.reflect.InvocationTargetException;

public class SeattleStore extends BurgerStore {

    @Override
    public Burger createBurger(Class c) {
        System.out.println("SeattleStore is making burgers!");
        Burger burger = null;
        try {
            burger = (Burger) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return burger;
    }
}
