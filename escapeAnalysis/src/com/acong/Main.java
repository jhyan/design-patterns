package com.acong;

public class Main {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            alloc();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("cost " + (t2 - t1) + " ms");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public static void alloc () {
        Person p = new Person();
    }
}
