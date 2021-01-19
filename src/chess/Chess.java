package chess;
//TODO: acabar partida + peón 2 movimientos salida y matar diagonal (ojo que mata recto) + uml's 

public class Chess {
    private Board board;
    private Turn turn;

    public Chess(){
        board = new Board();
        turn = new Turn();
    }

    public void play(){
        do {
            board.show();
            IO.getInstance().printText("Turno de " + turn.getCurrent().getColor());
            turn.getCurrent().move(board);
            turn.next();
        }while(!board.isDeadKing() || this.isResumed());
    }

    private boolean isResumed(){
        String answer;
        do{
            answer = IO.getInstance().readText("¿Reiniar la partida? (s/n)");
        } while( !answer.equals("s") && !answer.equals("n") );
        return answer.equals("s");
    }

    public static void main(String[] args) {
        new Chess().play();
    }
}
