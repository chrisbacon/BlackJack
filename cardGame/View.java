package cardGame;

public class View {
    private Log log;

    public View(Log log) {
        this.log = log;
    }
    public void displayCurrentPlayerHand() {
        Player player = log.getCurrentPlayer();
        System.out.println(player.getName() + ": " + player.getHandString());
    }

    public void displayDealerHand() {
        Dealer dealer = log.getDealer();
        System.out.println(dealer.getName() + ": " + dealer.getHandString());
    }

    public void displayResult() {
        Player winner = this.log.getWinner();
        Player loser = this.log.getLoser();
        if (!this.log.getDrawFlag()) {
            System.out.println(winner.getName() + " wins with " + winner.getHandValue() + " against " + loser.getHandValue() + "!");
        } else {
            System.out.println("Draw! Both the player and the dealer have " + winner.getHandValue()) ; 
        }

    }
}