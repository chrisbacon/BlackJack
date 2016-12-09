package cardGame;

import java.util.*;

public class Rules{

    private HashMap<Rank, Integer> singleCardValues;

    public Rules (int[] rankValues) {
        singleCardValues = new HashMap<Rank, Integer>();
        int i = 0;
        for (Rank rank : Rank.values()) {
            singleCardValues.put(rank, rankValues[i]);
            i++;
        }
    } 

    public int getCardValue(Card card) {
        return singleCardValues.get(card.getRank());
    }
}