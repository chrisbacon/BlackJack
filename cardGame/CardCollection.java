package cardGame;
import java.util.*;

public abstract class CardCollection {
    ArrayList<Card> cards;

    public CardCollection() {
        this.cards = new ArrayList<Card>();
    }

    public int getSize() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public String toString(String delimeter) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Card card : this.cards) {
            strings.add(card.toString()); 
        }
        return String.join(delimeter, strings);
    }

    @Override
    public String toString() {
        return toString(" ");
    }
}