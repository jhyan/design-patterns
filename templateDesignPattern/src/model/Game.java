package model;

public abstract class Game {
    public abstract void initGame();
    public abstract void playGame();
    public abstract void endGame();

    // final 不让修改
    public final void play(){
        initGame();
        playGame();
        addCharacterToGame(); // 这一步也留给子类决定
        endGame();
    }

    // hooked-on template method
    protected abstract void addCharacterToGame();
}
