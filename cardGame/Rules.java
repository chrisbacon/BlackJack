package cardGame;

import java.util.*;

public class Rules{

    private HashMap<Rank, Integer> singleCardValues;

    public Rules () {
        int [] rankValues = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11};
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