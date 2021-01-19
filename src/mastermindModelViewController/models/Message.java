package mastermindModelViewController.models;

public enum Message {
    GAME_TITLE ("-----MASTERMIND-----"),
    RESUME_ANSWER ("¿RESUME? (y/n): "),
    YES_ANSWER ("y"),
    NO_ANSWER("n"),
    PROPOSE("Propose a combination: "),
    WRONG_PROPOSE_LENGTH("Wrong proposed combination length"),
    WRONG_PROPOSE_COLORS("Wrong colors, they must be: rbygop"),
    WRONG_PROPOSE_REPEATED_COLORS("Repeated colors not allowed"),
    WIN("You've won!!! ;-)"),
    LOSSE("You've lost!!! :-("),
    SECRET_COMBINATION_CHARACTER("*"),
    ATTEMPT(" Attempt(s):"),
    BLACKS_AND_WHITES(" --> %s blacks and %s whites"),
    BYE("Bye bye!");
    private final String message;

    private Message(String message) {
        this.message = message;
    }

    public String getText(){
        return message;
    }

    public String toString() {
        return this.message;
    }

}
