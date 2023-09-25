package state;

public class Phone {
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handle() {
        currentState.handle();
    }
}
