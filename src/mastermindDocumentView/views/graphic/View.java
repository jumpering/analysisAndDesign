package mastermindDocumentView.views.graphic;

import mastermindDocumentView.models.Game;
import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.IO;
import mastermindDocumentView.views.console.GameView;
import mastermindDocumentView.views.console.ResumeView;

public class View {
    private mastermindDocumentView.views.console.GameView gameView;
    private ResumeView resumeView;
    private Game game;

    public View(Game game) {
        this.game = game;
    }

    private void reset() {
        IO.getInstance().printText(Message.GAME_TITLE);
        gameView = new GameView(this.game);
        resumeView = new ResumeView();
    }

    public void interact() {
        do {
            this.reset();
            do {
                gameView.interact();
            } while (!game.isFinished());
            gameView.writeResult();
            resumeView.interact();
        } while (this.resumeView.isResumed());
    }
}
