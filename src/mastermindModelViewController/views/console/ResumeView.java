package mastermindModelViewController.views.console;

import chess.IO;
import com.sun.jdi.request.MethodExitRequest;
import mastermindModelViewController.models.Message;
import mastermindModelViewController.utils.YesNoDialog;

public class ResumeView {

    private boolean resume;

    public void interact() {
        char yes = Message.YES_ANSWER.getText().charAt(0);
        char no = Message.NO_ANSWER.getText().charAt(0);
        YesNoDialog dialog = new YesNoDialog(Message.RESUME_ANSWER.getText(),yes,no);
        this.resume = dialog.answer();
    }

    public boolean isResumed(){
        return this.resume;
    }
}
