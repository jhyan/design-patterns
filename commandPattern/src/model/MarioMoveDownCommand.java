package model;

public class MarioMoveDownCommand implements Command {
    private MarioCharacter mario;

    public MarioMoveDownCommand(MarioCharacter mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveDown();
    }
}
