package mastermindDocumentView.utils;

public class YesNoDialog {

    private char answerCharacter;
    private String title;
    private char yes;
    private char no;

    public YesNoDialog(String title, char yes, char no){
        String input;
        this.title = title;
        this.yes = yes;
        this.no = no;
        do {
            input = IO.getInstance().readText(title);
            this.answerCharacter = input.charAt(0);
        } while (this.answerCharacter != yes && this.answerCharacter != no);
    }

    public boolean answer() {
        return this.answerCharacter == yes;
    }
}
