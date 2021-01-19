package mastermindModelViewController;

import mastermindModelViewController.models.Game;
import mastermindModelViewController.views.View;
import mastermindModelViewController.views.graphic.GraphicView;

public class GraphicMastermind extends Mastermind {

//    @Override
//    public View createView(Game game) {
//        return new GraphicView(game);
//    }

    public static void main(String[] args) {
        new GraphicMastermind().play();
    }

    @Override
    protected View createView() {
        return null;
    }
}
