package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        CEOPurchasePower ceo = new CEOPurchasePower();
        DirectorPurchasePower director = new DirectorPurchasePower();
        ManagerPurchasePower manager = new ManagerPurchasePower();

        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        while (true) {
            System.out.println("Please input the amount: ");
            System.out.println(">>");

            try {
                Double input = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.handlePurchaseRequest(new PurchaseRequest(input, "office"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
