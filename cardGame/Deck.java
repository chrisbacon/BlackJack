package cardGame;

import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public int getSize() {
        return this.deck.size();
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }

    public Card dealCard() {
        return this.deck.remove(0);
    }

    public void buildDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }
}