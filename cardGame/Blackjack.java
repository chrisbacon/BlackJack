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
    }

    public void addDealer(String name) {
        this.dealer = new Dealer(name, this.deck);
        this.log.setDealer(this.dealer);
    }

    public void dealCardsToPlayers() {
        this.log.setDrawFlag(false);
        this.dealer.shuffle();
        this.dealer.dealCardTo(this.player);
        this.dealer.dealCardTo(this.dealer);
        this.dealer.dealCardTo(this.player);
        this.dealer.dealCardTo(this.dealer);
    }

    public void nextTurn() {
        this.log.setCurrentPlayer(this.player);
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