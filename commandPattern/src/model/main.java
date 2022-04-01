package model;

public class main {
    public static void main(String[] args) {
        MarioCharacter mario = new MarioCharacter("mario");
        MarioMoveUpCommand marioMoveUpCommand = new MarioMoveUpCommand(mario);
        MarioMoveDownCommand marioMoveDownCommand = new MarioMoveDownCommand(mario);

        Gameboy gameboy = new Gameboy(marioMoveUpCommand, marioMoveDownCommand);

        gameboy.arrowUp();
        gameboy.arrowDown();
    }
}
