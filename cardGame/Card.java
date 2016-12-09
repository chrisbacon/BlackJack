package cardGame;

public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String showFace() {
        return this.rank + " of " + this.suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getValue(Rules rules) {
        return rules.getRankValue(this.rank);
    }
}