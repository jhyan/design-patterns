package model;

public abstract class BurgerStore {

    // create burger 让具体的商店去实现。
    // 如果是single factory的话，就是让factory实现。但是因为会有多个factory, 并不方便
    abstract public Burger createBurger(Class c);

    public Burger orderBurger(Class c) {
        Burger burger = createBurger(c);
        burger.cook();
        burger.box();
        return burger;
    }
}
