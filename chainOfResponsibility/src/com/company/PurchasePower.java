package com.company;

public abstract class PurchasePower {

    protected static final double BASE = 10000;
    PurchasePower successor;

    abstract String getRole();
    abstract double allowable();

    public PurchasePower getSuccessor() {
        return successor;
    }

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    protected void handlePurchaseRequest(PurchaseRequest request) {
        if (request.getAmount() <= allowable()) {
            System.out.println(getRole() + " will handle it");
        } else if (this.successor != null) {
            this.successor.handlePurchaseRequest(request);
        } else {
            throw new IndexOutOfBoundsException("no one can handle this amount!");
        }
    }

}
