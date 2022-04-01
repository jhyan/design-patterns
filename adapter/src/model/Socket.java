package model;

// Adaptee.
public class Socket {
    // voltage can also be a class itself
    private int voltage;

    public Socket(int voltage) {
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
