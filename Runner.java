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
    
    boolean keepPlaying = true;
    while (keepPlaying) {
        game.dealCardToPlayer();
        view.displayPlayerHand();
        if (game.isPlayerBust()) break ;
        keepPlaying = view.getPlayerMove();
    }

    //game.runDealerTurn();
    view.displayDealerHand();

    game.setResult();
    view.displayResult();
  }
    
}