package mastermindModelViewController.views.graphic;

import mastermindModelViewController.controllers.Controller;
import mastermindModelViewController.controllers.ProposedCombinationController;
import mastermindModelViewController.controllers.ResumeController;
import mastermindModelViewController.controllers.StartController;
import mastermindModelViewController.models.Game;
import mastermindModelViewController.views.View;
import mastermindModelViewController.views.console.GameView;
import mastermindModelViewController.views.console.ResumeView;

import javax.swing.*;

public class GraphicView extends View {
    private GameView gameView;
    private ResumeView resumeView;
    private Game game;

//    public GraphicView(Game game) {
//        super(game);
//    }
//
//    @Override
//    protected void reset() {
//
//    }

//    private void reset() {
//        IO.getInstance().printText(Message.GAME_TITLE);
//        gameView = new GameView(this.game);
//        resumeView = new ResumeView();
//    }
//
//    @Override
//    protected void gameViewInteract() {
//        JFrame f=new JFrame();//creating instance of JFrame
//
//        JButton b=new JButton("click");//creating instance of JButton
//        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
//
//        f.add(b);//adding button in JFrame
//
//        f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//
//    }
//
//    @Override
//    protected void gameViewWriteResult() {
//
//    }
//
//    @Override
//    protected void resumeViewInteract() {
//
//    }
//
//    @Override
//    protected boolean resumeViewIsResumed() {
//        return false;
//    }

    @Override
    public void visit(StartController startController) {

    }

    @Override
    public void visit(ProposedCombinationController proposedCombinationController) {

    }

    @Override
    public void visit(ResumeController resumeController) {

    }

    @Override
    public void interactWithControllers(Controller controller) {

    }

//    public void interact() {
//        do {
//            this.reset();
//            do {
//                gameView.interact();
//            } while (!game.isFinished());
//            gameView.writeResult();
//            resumeView.interact();
//        } while (this.resumeView.isResumed());
//    }
}
