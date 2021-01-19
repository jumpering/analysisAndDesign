package mastermindDocumentViewFactoryMethod.views.console;

import mastermindDocumentViewFactoryMethod.models.Attempt;
import mastermindDocumentViewFactoryMethod.models.Game;
import mastermindDocumentViewFactoryMethod.models.Message;
import mastermindDocumentViewFactoryMethod.models.SecretCombination;
import mastermindDocumentViewFactoryMethod.utils.IO;

public class AttemptView {

    private Game game;

    public AttemptView(Game game) {
        this.game = game;
    }

    public void writeln(int attempts) {
        IO.getInstance().printText(attempts + Message.ATTEMPT.getText());
    }

    public void interact(SecretCombination secretCombination) {
        Attempt attempt;
        attempt = new Attempt(secretCombination);
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
        attempt.read(proposedCombinationView.read());
        this.game.addAttempt(attempt);
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
