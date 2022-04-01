package model;

public class Main {
    public static void main(String[] args) {
        ACTMediatorImplementation mediator = new ACTMediatorImplementation();

        AircraftImplentation boeing = new AircraftImplentation(mediator, "boeing");
        AircraftImplentation battle = new AircraftImplentation(mediator, "battle");
        AircraftImplentation backup = new AircraftImplentation(mediator, "backup");

        mediator.addAircraft(boeing);
        mediator.addAircraft(battle);
        mediator.addAircraft(backup);

        boeing.sendMessage("hello from boing 1!");

    }
}
