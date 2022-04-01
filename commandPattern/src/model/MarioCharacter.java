package model;

public class MarioCharacter {
    private String name;

    public MarioCharacter(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp() {
        System.out.println(this.name + " moving up");
    }

    public void moveDown() {
        System.out.println(this.name + " moving down");
    }
}
