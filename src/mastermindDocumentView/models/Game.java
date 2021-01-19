package mastermindDocumentView.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Attempt> attemptList;
    private static final int ATTEMPTS = 10;

    public Game(){
        this.attemptList = new ArrayList<>();
    }

    public void addAttempt(Attempt attempt){
        attemptList.add(attempt);
    }

    public int getNumOfAttempts() {
        return attemptList.size();
    }

    public int getAttemptListSize(){
        return this.attemptList.size();
    }

    public Attempt getAttempt(int index){
        return this.attemptList.get(index);
    }

    public boolean isFinished(){
        return isWinner() || isLooser();
    }

    public boolean isWinner() {
        return attemptList.get(attemptList.size()-1).isWinner();
    }

    public boolean isLooser(){
        return attemptList.size() == ATTEMPTS;
    }

    public void resetAttemptList(){
        this.attemptList.clear();
    }
}