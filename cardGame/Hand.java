package cardGame;

import java.util.*;

public class Hand extends CardCollection {

    public Hand() {
        super();
    }

    public void returnCardsToDealer(Dealer dealer){
        while (getSize() > 0) {
            Card cardRemoved = this.cards.remove(0);
            dealer.addCardToDeck(cardRemoved); 
        }       
    }

    public int getValue(Rules rules) {
        int total = 0;
        for (Card card : this.cards) {
            total += rules.getCardValue(card);
        }
        return total;
    }
}