package cardGame;

import java.util.*;

public class Hand {
    ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public int getSize() {
        return this.cards.size();
    }
}