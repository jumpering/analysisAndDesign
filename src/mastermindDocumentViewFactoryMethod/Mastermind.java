package mastermindDocumentViewFactoryMethod;

import mastermindDocumentViewFactoryMethod.models.Game;
import mastermindDocumentViewFactoryMethod.views.View;

public abstract class Mastermind {

    private Game game;
    private View view;

    protected Mastermind() {
        this.game = new Game();
        this.view = createView(this.game);
    }

    protected abstract View createView (Game game);

    protected void play() {
        this.view.interact();
    }
}
