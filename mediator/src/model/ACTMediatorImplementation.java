package model;

import java.util.ArrayList;
import java.util.List;

public class ACTMediatorImplementation implements ACTMediator {

    private List<Aircraft> aircraftsList = new ArrayList<>();

    @Override
    public void addAircraft(Aircraft aircraft) {
        this.aircraftsList.add(aircraft);
    }

    @Override
    public void sendMessage(String msg, Aircraft aircraft) {
        for (Aircraft receiver : this.aircraftsList) {
            if (receiver != aircraft) {
                receiver.receiveMessage(msg);
            }
        }
    }
}
