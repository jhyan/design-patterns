package model;

import interfaces.AdapterInterfaces;

public class Adapter implements AdapterInterfaces {
    public Socket socket;

    public Adapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public int getUSVoltage() {
        return socket.getVoltage() / 2;
    }

    @Override
    public int getChinaVoltage() {
        return socket.getVoltage();
    }
}
