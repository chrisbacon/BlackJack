package cardGame;

public class Dealer extends Player {

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.deck.buildDeck();
    }

    public int getDeckSize() {
        return this.deck.getSize();
    }

    public void dealCardTo(Player receipient) {
        Card dealtCard = this.deck.dealCard();
        receipient.addCardToHand(dealtCard);
    }

    public void addCardToDeck(Card card) {
        this.deck.addCard(card);
    }
}