package mastermindDocumentViewFactoryMethod.views.console;

import mastermindDocumentViewFactoryMethod.models.Color;
import mastermindDocumentViewFactoryMethod.models.Message;
import mastermindDocumentViewFactoryMethod.models.ProposedCombination;
import mastermindDocumentViewFactoryMethod.utils.IO;

import java.util.HashSet;
import java.util.Set;

public class ProposedCombinationView {

    private String proposedInput;

    public ProposedCombination read(){
        ProposedCombination proposedCombination = new ProposedCombination();
        do {
            proposedInput = IO.getInstance().readText(Message.PROPOSE.getText());
        } while (!isValid());
        for (int i = 0; i < proposedCombination.getColorsLength(); i++) {
            proposedCombination.setColor(i, Color.valueOf(proposedInput.charAt(i)));
        }
        return proposedCombination;
    }

    private boolean isValid() {

        return isValidLength() && isValidColors() && isUniqueChars();
    }

    private boolean isValidLength() {
        if (proposedInput.length() != 4) {
            IO.getInstance().printText(Message.WRONG_PROPOSE_LENGTH.getText());
            return false;
        }
        return true;
    }

    private boolean isValidColors() {
        if (proposedInput.chars().filter(c -> Color.isValidColor((char) c)).count() != 4) {
            IO.getInstance().printText(Message.WRONG_PROPOSE_COLORS.getText());
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
            IO.getInstance().printText(Message.WRONG_PROPOSE_REPEATED_COLORS.getText());
            return false;
        }
        return true;
    }
}
