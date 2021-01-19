package mastermindDocumentViewFactoryMethod;

import mastermindDocumentViewFactoryMethod.models.Game;
import mastermindDocumentViewFactoryMethod.views.View;
import mastermindDocumentViewFactoryMethod.views.graphic.GraphicView;

public class GraphicMastermind extends Mastermind{

    @Override
    public View createView(Game game) {
        return new GraphicView(game);
    }

    public static void main(String[] args) {
        new GraphicMastermind().play();
    }
}
