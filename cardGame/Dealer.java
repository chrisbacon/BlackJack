package cardGame;

public class Dealer implements Dealable {

    private Deck deck;
    private Hand hand;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.deck.buildDeck();
    }

    public int getDeckSize() {
        return this.deck.getSize();
    }

    public void dealCardTo(Dealable receipient) {
        Card dealtCard = this.deck.dealCard();
        receipient.addCardToHand(dealtCard);
    }

    public void addCardToHand(Card card) {
    }
}