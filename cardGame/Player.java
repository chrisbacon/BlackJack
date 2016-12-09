package cardGame;

public class Player {
    private Hand hand;

    public Player() {
        this.hand = new Hand();
    }

    public void addCardToHand(Card card) {
        this.hand.addCard(card);
    }

    public void returnHandToDealer(Dealer dealer){
    }

}