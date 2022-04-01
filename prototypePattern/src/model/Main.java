package model;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = (Person) p1.clone();

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
