package com.company;

public class CEOPurchasePower extends PurchasePower {
    @Override
    String getRole() {
        return "CEO";
    }

    @Override
    double allowable() {
        return BASE * 100;
    }
}
