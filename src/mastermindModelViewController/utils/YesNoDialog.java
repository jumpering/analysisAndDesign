package mastermindModelViewController.utils;

public class YesNoDialog {

    private char answerCharacter;
    private String title;
    private char yes;
    private char no;

    public YesNoDialog(String title, char y, char n){
        String input;
        this.title = title;
        this.yes = y;
        this.no = n;
        do {
            input = IO.getInstance().readText(title);
            this.answerCharacter = input.charAt(0);
        } while (this.answerCharacter != yes && this.answerCharacter != no);
    }

    public boolean answer() {
        return this.answerCharacter == yes;
    }
}
