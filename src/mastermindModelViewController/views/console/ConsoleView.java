package mastermindModelViewController.views.console;

import mastermindModelViewController.controllers.*;
import mastermindModelViewController.models.Message;
import mastermindModelViewController.utils.IO;
import mastermindModelViewController.views.View;

public class ConsoleView extends View {

    private GameView gameView;

    public ConsoleView(){
        this.gameView = new GameView();
    }

    @Override
    public void interactWithControllers (Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        IO.getInstance().printText(Message.GAME_TITLE.getText());
        startController.interact();
        startController.next();
    }

    @Override
    public void visit(ProposedCombinationController proposedCombinationController) {
        this.gameView.interact(proposedCombinationController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeController.interact();
    }
}
