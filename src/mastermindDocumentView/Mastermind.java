package mastermindDocumentView;

import mastermindDocumentView.models.Game;
import mastermindDocumentView.views.console.View;

public class Mastermind {

    private Game game;
    private View view;

    public Mastermind() {
        this.game = new Game();
        this.view = new View(game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
