package cardGame;

public class Dealer {

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.deck.buildDeck();
    }

    public int getDeckSize() {
        return this.deck.getSize();
    }
}