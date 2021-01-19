package mastermind;

import java.util.*;

public class ProposedCombination extends Combination {

    private String proposedInput;
    private final String TEXT_PROPOSE = "Propose a combination: ";
    private final String TEXT_WRONG_PROPOSE_LENGTH = "Wrong proposed combination length";
    private final String TEXT_WRONG_PROPOSE_COLORS = "Wrong colors, they must be: rbygop";
    private final String TEXT_WRONG_PROPOSE_REPEATED_COLORS = "Repeated colors not allowed";

    public ProposedCombination() {
        super();
    }

    @Override
    public String toString() {
        return proposedInput;
    }

    public void read() {
        do {
            proposedInput = IO.getInstance().readText(TEXT_PROPOSE);
        } while (!isValid());
        for (int i = 0; i < this.colors.length; i++) {
            this.colors[i] = Color.valueOf(proposedInput.charAt(i));
        }
    }


    private boolean isValid() {

        return isValidLength() && isValidColors() && isUniqueChars();
    }

    private boolean isValidLength() {
        if (proposedInput.length() != 4) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_LENGTH);
            return false;
        }
        return true;
    }

    private boolean isValidColors() {
        if (proposedInput.chars().filter(c -> Color.isValidColor((char) c)).count() != 4) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_COLORS);
            return false;
        }
        return true;
    }

    private boolean isUniqueChars() {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < proposedInput.length(); i++) {
            if (!charSet.contains(proposedInput.charAt(i))) {
                charSet.add(proposedInput.charAt(i));
            }
        }
        if (charSet.size() != 4) {
            IO.getInstance().printText(TEXT_WRONG_PROPOSE_REPEATED_COLORS);
            return false;
        }
        return true;
    }
}
