package mastermindDocumentView.views.console;

import mastermindDocumentView.models.Game;
import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.IO;

public class View {
    private GameView gameView;
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
