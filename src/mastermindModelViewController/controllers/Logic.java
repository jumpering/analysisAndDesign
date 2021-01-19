package mastermindModelViewController.controllers;

import mastermindModelViewController.models.Game;
import mastermindModelViewController.models.State;
import mastermindModelViewController.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Map<StateValue, Controller> controllersList;
    private Game game;
    private State state;

    public Logic(){
        this.game = new Game();
        this.state = new State();
//        this.controllersList = Map.of(
//                StateValue.START, new StartController(this.game, this.state),
//                StateValue.IN_GAME, new InGameController(game, this.state)
//        );
        this.controllersList = new HashMap<StateValue,Controller>();
        this.controllersList.put(StateValue.START, new StartController(game, state));
        this.controllersList.put(StateValue.PROPOSE_COMBINATIONS, new ProposedCombinationController(game, state));
        this.controllersList.put(StateValue.ASK_RESUME, new ResumeController(game, state));
//        this.controllersList.put(StateValue.EXIT, new ExitController(game, state));
    }
    public Controller getController(){
        return this.controllersList.get(this.state.getStateValue());
    }

    public boolean isEnd(){
        return this.state.getStateValue().equals(StateValue.EXIT);
    }

}
