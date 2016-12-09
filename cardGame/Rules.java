package cardGame;

import java.util.*;

public class Rules{

    private static final int [] rankValues = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11};

    public static int getRankValue(Rank rank) {
        return rankValues[rank.ordinal()];
    }
}