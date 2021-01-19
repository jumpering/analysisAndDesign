package mastermindModelViewController.controllers;

import chess.IO;
import mastermindDocumentView.utils.YesNoDialog;
import mastermindModelViewController.models.Game;
import mastermindModelViewController.models.Message;
import mastermindModelViewController.models.State;
import mastermindModelViewController.views.console.ResumeView;

public class ResumeController extends Controller{

    private ResumeView resumeView;

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void interact(){
        this.resumeView = new ResumeView();
        this.resumeView.interact();
        if (this.resumeView.isResumed()){
            this.state.resetState();
        } else {
            IO.getInstance().printText(Message.BYE.getText());
            next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
