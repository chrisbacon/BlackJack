package cardGame;

import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();    
    }

    public int getDeckSize() {
        return this.deck.size();
    }    
}