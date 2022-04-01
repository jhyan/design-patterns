package model;

public abstract class Aircraft {

    protected ACTMediator mediator;
    protected String name;

    public Aircraft(ACTMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
}

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);
}
