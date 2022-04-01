package model;

public class Context {

    private State startState;
    private State endState;
    private State curState;

    // new 的时候放在constructor里更明晰
    public Context() {
        this.startState = new StartState(this);
        this.endState = new EndState(this);
        this.curState = startState;
    }

    // key, run the machine
    public void run() {
        curState.run();
    }

    public void setStartState(State startState) {
        this.startState = startState;
    }

    public void setEndState(State endState) {
        this.endState = endState;
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

    public State getStartState() {
        return startState;
    }

    public State getEndState() {
        return endState;
    }

    public State getCurState() {
        return curState;
    }


}
