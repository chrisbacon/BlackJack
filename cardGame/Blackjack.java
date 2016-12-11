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
        this.dealer.shuffle();
    }

    public void dealCardToPlayer() {
        this.dealer.dealCardTo(this.player);
    }

    public void dealCardToDealer() {
        this.dealer.dealCardTo(this.dealer);
    }

    public void checkForBust() {
        this.log.setBust(Rules.checkForBust(this.player));
    }

    public void handleMove() {
        String move = this.log.getMove();
        switch (move) {
            case "stick": this.log.setPlaying(false);
                          break;   
            case"twist":  this.log.setPlaying(true);
                          break;
        }
    }

    public void setResult() {
        if (Rules.didDraw(this.player, this.dealer)) {
            this.log.setDraw(true);
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