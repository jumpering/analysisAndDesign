package mastermindModelViewController.views;

import mastermindModelViewController.controllers.Controller;
import mastermindModelViewController.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public abstract void interactWithControllers(Controller controller);
}
