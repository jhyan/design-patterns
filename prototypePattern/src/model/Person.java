package model;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Person implements Animal{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        try {
            // don't forget to cast here. 多态！
            return (Person)super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
