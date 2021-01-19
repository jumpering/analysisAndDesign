package mastermindDocumentViewFactoryMethod.views.console;

import mastermindDocumentViewFactoryMethod.models.Game;
import mastermindDocumentViewFactoryMethod.models.Message;
import mastermindDocumentViewFactoryMethod.utils.IO;
import mastermindDocumentViewFactoryMethod.views.View;

public class ConsoleView extends View {
    private GameView gameView;
    private ResumeView resumeView;

    public ConsoleView(Game game) {
        super(game);
    }

    @Override
    protected void reset() {
        IO.getInstance().printText(Message.GAME_TITLE);
        gameView = new GameView(this.game);
        resumeView = new ResumeView();
    }

    @Override
    protected void gameViewInteract() {
        gameView.interact();
    }

    @Override
    protected void gameViewWriteResult() {
        gameView.writeResult();
    }

    @Override
    protected void resumeViewInteract() {
        resumeView.interact();
    }

    @Override
    protected boolean resumeViewIsResumed() {
        return this.resumeView.isResumed();
    }
}
