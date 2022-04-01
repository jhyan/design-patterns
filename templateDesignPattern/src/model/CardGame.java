package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardGame extends Game {
    @Override
    public void initGame() {
        System.out.println("initializing card game now");
    }

    @Override
    public void playGame() {
        System.out.println("playing card game now");
    }

    @Override
    public void endGame() {
        System.out.println("ending game now");
    }

    // 有这个逻辑就操作并问玩家。其他游戏没有这个逻辑就不作任何事情
    @Override
    protected void addCharacterToGame() {
        System.out.println("Would you like to add characters in the game? Y/N");
        boolean doesPlayerWantToAddCharacter = getInputAndTranslateToBoolean();
        if (doesPlayerWantToAddCharacter) {
            System.out.println("adding character!");
        } else {
            System.out.println("characters not added!");
        }
    }

    public boolean getInputAndTranslateToBoolean() {
        String answer = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error");
            return false;
        }

        switch (answer) {
            case "Y": return true;
            case "N": return false;
            default: throw new IllegalArgumentException("input has to be Y or F");
        }
    }
}
