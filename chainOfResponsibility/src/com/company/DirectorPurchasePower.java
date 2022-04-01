package com.company;

public class DirectorPurchasePower extends PurchasePower {
    @Override
    String getRole() {
        return "Director";
    }

    @Override
    double allowable() {
        return BASE * 10;
    }
}
