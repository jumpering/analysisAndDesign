package mastermind;

public class Mastermind {

    private Game game;
    private final String TITLE = "-----MASTERMIND-----";
    private final String RESUME_ANSWER = "¿RESUME? (y/n): ";

    public void play() {
        IO.getInstance().printText(TITLE);
        do {
            this.game = new Game();
            this.game.play();
        } while (this.isResumed());
    }

    private boolean isResumed() {
        IO.Answer answer;
        do {
            String answerInput = IO.getInstance().readText(RESUME_ANSWER);
            answer = IO.Answer.valueOf(answerInput.charAt(0));
        } while (answer != IO.Answer.YES && answer != IO.Answer.NO);
        return answer == IO.Answer.YES;
    }

    public static void main(String[] args) {

        new Mastermind().play();
    }
}
