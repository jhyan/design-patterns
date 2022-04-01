package interfaces;

// 提醒子类，一定要有一个前任iceCream
public class IceCreamDecorator implements IceCream {

    public IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }


}
