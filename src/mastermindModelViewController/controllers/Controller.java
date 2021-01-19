package mastermindModelViewController.controllers;

import mastermindModelViewController.models.Game;
import mastermindModelViewController.models.State;

public abstract class Controller {

    protected Game game;
    protected State state;

    public Controller(Game game, State state){
        this.game = game;
        this.state = state;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

    public void next(){
        this.state.nextState();
    }

    public Game getGame(){
        return this.game;
    }
}
