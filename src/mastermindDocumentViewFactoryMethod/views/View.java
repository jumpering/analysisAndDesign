package mastermindDocumentViewFactoryMethod.views;

import mastermindDocumentViewFactoryMethod.models.Game;

public abstract class View {
    protected Game game;

    public View(Game game) {
        this.game = game;
    }

    public void interact() {
        do {
            this.reset();
            do {
                this.gameViewInteract();
            } while (!game.isFinished());
            this.gameViewWriteResult();
            this.resumeViewInteract();
        } while (this.resumeViewIsResumed());
    }

    protected abstract void reset();

    protected abstract void gameViewInteract();

    protected abstract void gameViewWriteResult();

    protected abstract void resumeViewInteract();

    protected abstract boolean resumeViewIsResumed();
}
