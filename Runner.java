import cardGame.*;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Log log = new Log();
    Blackjack game = new Blackjack(log);
    View view = new View(log);

    game.addPlayer("Chris");
    game.addDealer("Logan");

    game.setUp();
    game.dealCardToPlayer();
    game.dealCardToDealer();
    game.dealCardToDealer();
    
    while (log.getPlaying()) {
        game.dealCardToPlayer();
        view.displayPlayerHand();
        game.checkForBust();
        if (log.getBust()) {
            break;
        }
        view.getPlayerMove();
        game.handleMove();
    }

    if (!log.getBust()) {
        //game.runDealerTurn();
        view.displayDealerHand();  
    }   

    game.setResult();
    view.displayResult();
  }
    
}