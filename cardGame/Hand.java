package cardGame;

import java.util.*;

public class Hand extends CardCollection {

    Integer value;

    public Hand() {
        super();
        this.value = null;
    }

    public void returnCardsToDealer(Dealer dealer){
        while (getSize() > 0) {
            Card cardRemoved = this.cards.remove(0);
            dealer.addCardToDeck(cardRemoved); 
            value = null;
        }       
    }

    public int getValue() {
        if (value == null) {
            return Rules.getHandValue(this.cards);
        }
        return value;
    }
}