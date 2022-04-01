package modal;

public class main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory ram = new Memory();
        Harddrive hd = new Harddrive();
        Facade facade = new Facade(cpu, ram, hd);
        facade.start();
    }
}
