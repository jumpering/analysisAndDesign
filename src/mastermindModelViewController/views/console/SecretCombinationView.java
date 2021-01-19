package mastermindModelViewController.views.console;

import mastermindModelViewController.models.Message;
import mastermindModelViewController.models.SecretCombination;
import mastermindModelViewController.utils.IO;

public class SecretCombinationView {

    private final SecretCombination secretCombination;

    public SecretCombinationView(){
        this.secretCombination = new SecretCombination();
    }

    public void writeln() {
        StringBuilder asteriskCombination = new StringBuilder();
        for (int i = 0; i < secretCombination.getColorsLength(); i++) {
            asteriskCombination.append(Message.SECRET_COMBINATION_CHARACTER);
        }
        IO.getInstance().printText(asteriskCombination);
        writeColors(); //FOR SHOW SECRET
    }

    public SecretCombination getSecretCombination(){
        return this.secretCombination;
    }

    private void writeColors() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < secretCombination.getColorsLength(); i++) {
            stringBuilder.append(secretCombination.getColor(i).getKeyword());
        }
        IO.getInstance().printText(stringBuilder);
    }
}
