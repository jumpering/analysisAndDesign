package mastermindDocumentView.models;

import java.util.Random;

public class SecretCombination extends Combination {

    public SecretCombination() {
        super();
        this.generateRandom();
    }

    public void generateRandom() {
        int count = 0;
        do {
            int randomInt = new Random().nextInt(Color.values().length);
            Color randomColor = Color.values()[randomInt];
            if (!this.hasColor(randomColor)) {
                this.colors[count] = randomColor;
                count++;
            }
        } while (count < this.colors.length);
    }

    public int getBlacks(ProposedCombination proposedCombination) {
        int blacks = 0;
        for (int i = 0; i < this.colors.length; i++) {
            if (this.colors[i] == proposedCombination.colors[i]) {
                blacks++;
            }
        }
        return blacks;
    }

    public int getWhites(ProposedCombination proposedCombination) {
        int whites = 0;
        for (int i = 0; i < this.colors.length; i++) {
            if (proposedCombination.hasColor(this.colors[i]) && this.colors[i] != proposedCombination.colors[i]) {
                whites++;
            }
        }
        return whites;
    }
}

