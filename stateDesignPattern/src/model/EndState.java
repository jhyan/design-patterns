package model;

public class EndState implements State {

    public Context context;

    public EndState(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        System.out.println("ending!");
        // end goes to start state
        this.context.setCurState(context.getStartState());
    }

    @Override
    public String toString() {
        return "end state";
    }
}

