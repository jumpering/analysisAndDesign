package mastermindModelViewController.controllers;

import mastermindModelViewController.models.Game;
import mastermindModelViewController.models.State;
import mastermindModelViewController.views.console.SecretCombinationView;

public class StartController extends Controller {

    private SecretCombinationView secretCombinationView;

    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void interact() {
        this.game.resetAttemptList();
    }
}
