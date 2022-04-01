package model;

public class MarioMoveUpCommand implements Command {

    private MarioCharacter mario;

    public MarioMoveUpCommand(MarioCharacter mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveUp();
    }
}
