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
}