package mastermindModelViewController.views.console;

import mastermindModelViewController.models.Attempt;
import mastermindModelViewController.models.Message;
import mastermindModelViewController.utils.IO;

public class AttemptView {

    public void writeln(int attempts) {
        IO.getInstance().printText(attempts + Message.ATTEMPT.getText());
    }

    public static void writeColors(Attempt attempt) {
        StringBuilder stringProposedCombination = new StringBuilder();
        for (int i = 0; i < attempt.getProposedCombination().getColorsLength(); i++) {
            stringProposedCombination.append(attempt.getProposedCombination().getColor(i).getKeyword());
        }
        String stringBlacksAndWhites = String.format(Message.BLACKS_AND_WHITES.toString(),
                                                    attempt.getPiecesBlack(),
                                                    attempt.getPiecesWhite());
        IO.getInstance().printText(stringProposedCombination + stringBlacksAndWhites);
    }
}
