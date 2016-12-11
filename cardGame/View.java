package cardGame;

public class View {
    private Log log;

    public View(Log log) {
        this.log = log;
    }
    public void displayPlayerHand() {
        Player player = log.getPlayer();
        System.out.println(player.getName() + ": " + player.getHandString());
    }

    public void displayDealerHand() {
        Dealer dealer = log.getDealer();
        System.out.println(dealer.getName() + ": " + dealer.getHandString());
    }

    public void displayResult() {
        Player winner = this.log.getWinner();
        Player loser = this.log.getLoser();
        String output;

        if (!this.log.getDrawFlag()) {
            output = winner.getName() + " wins with " + winner.getHandValue() + " against " + loser.getHandValue() + "!";
        } else {
            output = "Draw! Both the player and the dealer have " + winner.getHandValue();
        }
        System.out.println(); 

    }

    public boolean getPlayerMove() {
        return true;
    }
}