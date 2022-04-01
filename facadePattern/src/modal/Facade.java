package modal;

public class Facade {
    private CPU cpu;
    private Memory ram;
    private Harddrive hd;

    public Facade(CPU cpu, Memory ram, Harddrive hd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        cpu.freeze();
        ram.load(100, hd.read(100, 100));
        cpu.jump();
        cpu.execute();
    }
}
