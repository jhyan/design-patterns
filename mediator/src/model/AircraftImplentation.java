package model;

public class AircraftImplentation extends Aircraft {

    public AircraftImplentation(ACTMediator mediator, String name) {
        super(mediator, name);
    }

    // aircraft doesn't care about to whom it's sending to
    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name + " sending message " + msg);
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.name + " receiving message " + msg);
    }
}
