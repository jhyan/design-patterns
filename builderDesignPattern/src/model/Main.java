package model;

public class Main {
    public static void main(String args[]){
        Person alice = new Person.Builder()
                .setAge(27).setFirstName("me").setLastName("you").build();

        System.out.println(alice);
    }
}
