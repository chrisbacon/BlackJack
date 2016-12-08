package cardGame;

public class Card {

    private Enum suit;
    private Enum rank;

    public Card(Enum suit, Enum rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String showFace() {
        return this.rank + " of " + this.suit;
    }
}