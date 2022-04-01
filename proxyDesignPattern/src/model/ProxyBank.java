package model;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private RealBank realBank;
    private static List<String> blackList;

    static {
        blackList = new ArrayList<>();
        blackList.add("alice");
        blackList.add("bob");
    }

    public ProxyBank(RealBank realBank) {
        this.realBank = realBank;
    }

    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (blackList.contains(clientName.toLowerCase())) {
            throw new Exception(clientName + "Access denied.");
        }

        realBank.withdrawMoney(clientName);
    }
}
