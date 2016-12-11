import cardGame.*;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Log log = new Log();
    Blackjack game = new Blackjack(log);
    View view = new View(log);

    game.addPlayer("Chris");
    game.addDealer("Logan");

    game.dealCardsToPlayers();

    game.nextTurn();
    view.displayCurrentPlayerHand();
    view.displayDealerHand();

    game.setResult();
    view.displayResult();
  }
    
}