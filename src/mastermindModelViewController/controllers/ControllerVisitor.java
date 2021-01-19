package mastermindModelViewController.controllers;

public interface ControllerVisitor {

    public void visit(StartController startController);

    public void visit(ProposedCombinationController proposedCombinationController);

    public void visit(ResumeController resumeController);
}
