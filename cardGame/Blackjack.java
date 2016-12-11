package cardGame;

import java.util.*;

public class Blackjack {
    private Player player;
    private Dealer dealer;
    private Deck deck;
    private Rules rules;
    private Log log;

    public Blackjack(Log log) {
        this.deck = new Deck();
        this.deck.buildDeck(); 
        this.log = log;
    } 

    public void addPlayer(String name) {
        this.player = new Player(name);
        this.log.setPlayer(this.player);
    }

    public void addDealer(String name) {
        this.dealer = new Dealer(name, this.deck);
        this.log.setDealer(this.dealer);
    }

    public void setUp() {
        this.log.setDrawFlag(false);
        this.dealer.shuffle();
    }

    public void dealCardToPlayer() {
        this.dealer.dealCardTo(this.player);
    }

    public void dealCardToDealer() {
        this.dealer.dealCardTo(this.dealer);
    }

    public boolean isPlayerBust() {
        return Rules.checkForBust(this.player);
    }

    public void setResult() {
        if (Rules.didDraw(this.player, this.dealer)) {
            this.log.setDrawFlag(true);
            this.log.setWinner(dealer);
            this.log.setLoser(player);
        } else if (Rules.didPlayerWin(this.player, this.dealer)) {
            this.log.setWinner(player);
            this.log.setLoser(dealer);
        } else {
            this.log.setWinner(dealer);
            this.log.setLoser(player);
            
        }
    }
}