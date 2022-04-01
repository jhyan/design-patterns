package model;

public interface ACTMediator {
    void addAircraft(Aircraft aircraft);
    void sendMessage(String msg, Aircraft aircraft); // from aircraft send this msg
}
