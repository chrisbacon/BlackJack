package cardGame;

import java.util.*;

public class Rules{

    private HashMap<Rank, Integer> singleCardValues;

    public Rules (HashMap<Rank, Integer> singleCardValues) {
        singleCardValues = singleCardValues;
    } 

    public int getCardValue(Card card) {
        return singleCardValues.get(card.getRank());
    }
}