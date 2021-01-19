package mastermind;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Attempt> attemptList;
    private SecretCombination secretCombination;
    private static final int ATTEMPTS = 10;
    private final String TEXT_ATTEMPTS = " attempt(s)";
    private final String TEXT_WIN = "You've won!!! ;-)";
    private final String TEXT_LOSE = "You've lose :(";

    public Game() {
        attemptList = new ArrayList<Attempt>();
        secretCombination = new SecretCombination();
    }

    public void play() {
        Attempt attempt;
        do {
            IO.getInstance().printText(attemptList.size() + TEXT_ATTEMPTS);
            IO.getInstance().printText(secretCombination.toString());
            attempt = new Attempt();
            attempt.read(secretCombination);
            attemptList.add(attempt);
            this.showAllResults();
        } while (!isFinished());
        if (attempt.isWinner()) {
            IO.getInstance().printText(TEXT_WIN);
        } else {
            IO.getInstance().printText(TEXT_LOSE);
        }
    }

    private void showAllResults() {
        attemptList.stream().forEach(a -> IO.getInstance().printText(a.toString()));
    }

    private boolean isFinished() {
        return attemptList.size() == ATTEMPTS || attemptList.get(attemptList.size() - 1).isWinner();
    }
}