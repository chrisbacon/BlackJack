package cardGame;

public interface Dealable {
    public void addCardToHand(Card card);
    public void returnHandToDealer(Dealer dealer);
}