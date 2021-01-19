package mastermindModelViewController.models;

public class State {

    private StateValue stateValue;

    public State(){
        this.stateValue = StateValue.START;
    }

    public void nextState(){
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }

    public StateValue getStateValue(){
        return this.stateValue;
    }

    public void resetState(){
        this.stateValue = StateValue.START;
    }
}
