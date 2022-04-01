package model;

public class Gameboy {
    private Command moveUp, moveDown;

    public Gameboy(Command moveUp, Command moveDown) {
        this.moveUp = moveUp;
        this.moveDown = moveDown;
    }

    public void arrowUp(){
        moveUp.execute();
    }

    public void arrowDown(){
        moveDown.execute();
    }
}
