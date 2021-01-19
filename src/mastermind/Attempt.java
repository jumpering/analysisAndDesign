package mastermind;

public class Attempt {

    private ProposedCombination proposedCombination;
    private int piecesBlack;
    private int piecesWhite;
    private final int BLACK_PIECES_FOR_WIN = 4;

    public Attempt() {
        this.piecesBlack = 0;
        this.piecesWhite = 0;
    }

    public boolean isWinner(){
        return this.piecesBlack == BLACK_PIECES_FOR_WIN;
    }

    public void read(SecretCombination secretCombination){
        this.proposedCombination = new ProposedCombination();
        this.proposedCombination.read();
        this.piecesBlack = secretCombination.getBlacks(this.proposedCombination);
        this.piecesWhite = secretCombination.getWhites(this.proposedCombination);
    }

    public String toString(){
        return this.proposedCombination.toString() + " --> " + this.piecesBlack + " blacks and " + this.piecesWhite + " whites";
    }
}
