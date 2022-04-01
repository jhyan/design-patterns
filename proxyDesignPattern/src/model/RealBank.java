package model;

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println(clientName + "withdraw money from real bank");
    }
}
