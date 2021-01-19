package mastermindModelViewController;

import mastermindModelViewController.views.View;
import mastermindModelViewController.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    @Override
    public View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

//    protected Mastermind() {
//        this.logic = new Logic();
//        this.view = createView();
//    }

//    protected void play() {
//        do {
//            this.view.interactWithControllers(this.logic.getControler);
//        } while (!this.logic.isEnd);
//    }
}
