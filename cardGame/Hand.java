package cardGame;

import java.util.*;

public class Hand extends CardCollection {

    public Hand() {
        super();
    }

    public void returnCardsTo(Dealer dealer){
        while (getSize() > 0) {
            Card cardRemoved = this.cards.remove(0);
            dealer.addCardToDeck(cardRemoved); 
        }       
    }
}