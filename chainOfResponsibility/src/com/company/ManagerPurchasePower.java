package com.company;

public class ManagerPurchasePower extends PurchasePower{
    @Override
    String getRole() {
        return "Manager";
    }

    @Override
    double allowable() {
        return BASE;
    }
}
