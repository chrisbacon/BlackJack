package cardGame;

public class Dealer extends Player {

    private Deck deck;

    public Dealer(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }

    public int getDeckSize() {
        return this.deck.getSize();
    }

    public void shuffle() {
        this.deck.shuffle();
    }

    public void dealCardTo(Player receipient) {
        Card dealtCard = this.deck.dealCard();
        receipient.addCardToHand(dealtCard);
    }

    public void addCardToDeck(Card card) {
        this.deck.addCard(card);
    }
}