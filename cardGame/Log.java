package cardGame;

public class Log {
    private Player winner;
    private Player loser;
    private Player currentPlayer;
    private Dealer dealer;
    private boolean draw;

    public Log() {
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public void setDrawFlag (boolean flag) {
        this.draw = flag;
    }

    public boolean getDrawFlag () {
        return this.draw;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void setLoser(Player loser) {
        this.loser = loser ;
    }

    public Player getLoser() {
        return this.loser;
    }

}