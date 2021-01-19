package mastermindModelViewController.views.console;

import mastermindModelViewController.controllers.ProposedCombinationController;
import mastermindModelViewController.models.Message;
import mastermindModelViewController.utils.*;

public class GameView {

    private AttemptView attemptView;
    private SecretCombinationView secretCombinationView;
    private ProposedCombinationController proposedCombinationController;

    public GameView() {
        this.attemptView = new AttemptView();
    }

    public void interact(ProposedCombinationController proposedCombinationController) {
        this.secretCombinationView = new SecretCombinationView();
        this.proposedCombinationController = proposedCombinationController;
        do{
            writeNumOfAttempts(this.proposedCombinationController);
            writeSecretCombination();
            proposedCombinationController.addAttempt(this.secretCombinationView.getSecretCombination());
            writeAttempts(this.proposedCombinationController);
        }while(!this.proposedCombinationController.isContinuePlaying());
        writeResult();
        this.proposedCombinationController.next();
    }

    private void writeNumOfAttempts(ProposedCombinationController proposedCombinationController) {
        this.attemptView.writeln(proposedCombinationController.getGame().getNumOfAttempts());
    }

    private void writeSecretCombination() {
        this.secretCombinationView.writeln();
    }

    private void writeAttempts(ProposedCombinationController proposedCombinationController) {
        for (int i = 0; i < proposedCombinationController.getGame().getAttemptListSize(); i++) {
            AttemptView.writeColors(proposedCombinationController.getGame().getAttempt(i));
        }
    }

    public void writeResult() {

        if (this.proposedCombinationController.getGame().isWinner()) {
            IO.getInstance().printText(Message.WIN);
        } else if (this.proposedCombinationController.getGame().isLooser()) {
            IO.getInstance().printText(Message.LOSSE);
        }
    }
}
