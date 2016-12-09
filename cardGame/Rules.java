package cardGame;

import java.util.*;

public class Rules{

    private static final int [] rankValues = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11};

    public static int getCardValue(Card card) {
        return rankValues[card.getRank().ordinal()];
    }

    public static int getHandValue(ArrayList<Card> hand) {
        int total = 0;
        for (Card card : hand) {
            total += getCardValue(card);
        }
        return total;
    }

    public static boolean didPlayerWin(Player player, Dealer dealer) {
        return (player.getHandValue() > dealer.getHandValue());
    }
}