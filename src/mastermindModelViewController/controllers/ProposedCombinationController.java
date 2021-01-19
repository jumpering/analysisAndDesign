package mastermindModelViewController.controllers;

import mastermindModelViewController.models.ProposedCombination;
import mastermindModelViewController.models.Attempt;
import mastermindModelViewController.models.Game;
import mastermindModelViewController.models.State;
import mastermindModelViewController.models.SecretCombination;
import mastermindModelViewController.models.Color;
import mastermindModelViewController.views.console.ProposedCombinationView;

public class ProposedCombinationController extends Controller{
    private Attempt attempt;
    private ProposedCombination proposedCombination;
    private ProposedCombinationView proposedCombinationView;


    public ProposedCombinationController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public boolean isContinuePlaying(){
        return this.game.isFinished();
    }

    public void addAttempt(SecretCombination secretCombination){
        this.attempt = new Attempt(secretCombination);
        this.attempt.read(readProposedCombination());
        this.game.addAttempt(attempt);
    }

    public ProposedCombination readProposedCombination(){
        this.proposedCombination = new ProposedCombination();
        this.proposedCombinationView = new ProposedCombinationView();
        for (int i = 0; i < this.proposedCombination.getColorsLength(); i++) {
            this.proposedCombination.setColor(i, Color.valueOf(this.proposedCombinationView.getProposedInput().charAt(i)));
        }
        return this.proposedCombination;
    }
}
