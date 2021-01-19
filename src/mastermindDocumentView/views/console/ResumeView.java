package mastermindDocumentView.views.console;

import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.YesNoDialog;

public class ResumeView {

    private boolean resume;

    public boolean interact() {
        char yes = Message.YES_ANSWER.getText().charAt(0);
        char no = Message.NO_ANSWER.getText().charAt(0);
        YesNoDialog dialog = new YesNoDialog(Message.RESUME_ANSWER.getText(),yes,no);
        if(dialog.answer()){
            this.resume = true;
            return true;
        }
        this.resume = false;
        return false;
    }

    public boolean isResumed(){
        return this.resume;
    }
}
