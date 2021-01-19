package mastermindModelViewController;

import mastermindModelViewController.views.View;
import mastermindModelViewController.controllers.Logic;

public abstract class Mastermind {

    private Logic logic;
    private View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = createView();
    }

    protected abstract View createView();

    protected void play() {
        do {
            this.view.interactWithControllers(this.logic.getController());
            } while (!this.logic.isEnd());
    }
}