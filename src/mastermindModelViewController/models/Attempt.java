package mastermindModelViewController.models;

public class Attempt {

    private ProposedCombination proposedCombination;
    private SecretCombination secretCombination;
    private int piecesBlack;
    private int piecesWhite;

    private final int BLACK_PIECES_FOR_WIN = 4;

    public Attempt(SecretCombination secretCombination) {
        assert secretCombination != null : "secretCombination can't be null";
        this.secretCombination = secretCombination;
        this.piecesBlack = 0;
        this.piecesWhite = 0;
    }

    public boolean isWinner() {
        return this.piecesBlack == BLACK_PIECES_FOR_WIN;
    }

    public void read(ProposedCombination proposedCombination) {
        assert proposedCombination != null : "ProposedCombination can't be null";
        this.proposedCombination = proposedCombination;
        this.piecesBlack = secretCombination.getBlacks(this.proposedCombination);
        this.piecesWhite = secretCombination.getWhites(this.proposedCombination);
    }

    public int getPiecesBlack() {
        return piecesBlack;
    }

    public int getPiecesWhite() {
        return piecesWhite;
    }

    public ProposedCombination getProposedCombination() {
        return this.proposedCombination;
    }
}
