package cardGame;

import java.util.*;

public class Blackjack {
    private Player player;
    private Dealer dealer;
    private Deck deck;
    private Rules rules;

    public Blackjack() {
        this.deck = new Deck();
        this.deck.buildDeck(); 
        this.rules = new Rules();
    } 

    public void addPlayer(String name) {
        this.player = new Player(name);
    }

    public void addDealer(String name) {
        this.dealer = new Dealer(name, this.deck);
    }

    public void dealCardsToPlayers() {
        this.dealer.shuffle();
        this.dealer.dealCardTo(this.player);
        this.dealer.dealCardTo(this.dealer);
        this.dealer.dealCardTo(this.player);
        this.dealer.dealCardTo(this.dealer);
    }

    public String findWinner() {
        int playerScore = player.getHandValue();
        int dealerScore = player.getHandValue();
        if (Rules.didPlayerWin(this.player, this.dealer)) {
            return "Player wins with " + playerScore + " against " + dealerScore + "!";
        } else if (Rules.didPlayerWin(this.player, this.dealer)) {
            return "Dealer wins with " + dealerScore + " against " + playerScore + "!";
        } else {
            return "Draw! Player had " + playerScore + " and dealer had " + dealerScore + "!";
        }
    }
}