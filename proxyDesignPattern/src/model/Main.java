package model;

public class Main {
    public static void main(String[] args){
        RealBank bank = new RealBank();
        ProxyBank proxyBank = new ProxyBank(bank);

        try {
            proxyBank.withdrawMoney("me");
            proxyBank.withdrawMoney("alice");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
