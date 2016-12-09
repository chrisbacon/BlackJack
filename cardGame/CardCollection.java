package cardGame;
import java.util.*;

public abstract class CardCollection {
    private ArrayList<Card> cards;

    public CardCollection() {
        this.cards = new ArrayList<Card>();
    }

    public int getSize() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
}