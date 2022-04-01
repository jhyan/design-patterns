package model;

import javax.sound.midi.SysexMessage;

public class StartState implements State {
    private Context context;

    public StartState(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        System.out.println("starting!");
        // start goes to the end state
        // use getEndState 而不是new一个
        context.setCurState(context.getEndState());
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
