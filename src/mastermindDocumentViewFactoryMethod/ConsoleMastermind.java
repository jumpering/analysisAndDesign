package mastermindDocumentViewFactoryMethod;

import mastermindDocumentViewFactoryMethod.models.Game;
import mastermindDocumentViewFactoryMethod.views.View;
import mastermindDocumentViewFactoryMethod.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

    @Override
    public View createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
