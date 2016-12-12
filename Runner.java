import cardGame.*;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Log log = new Log();
    Blackjack game = new Blackjack(log);
    View view = new View(log);

    game.addPlayer("Player");
    game.addDealer("Dealer");

    game.setUp();
    game.dealCardToCurrentPlayer();
    game.dealCardToDealer();
    
    int i = 0;
    while (i<2) {
        while (log.getPlaying() && !log.getBust()) {
            game.dealCardToCurrentPlayer();
            view.displayCurrentPlayerHand();
            if (log.getBust()) {
                break;
            }
            view.getPlayerMove();
            game.handleMove();
        }
        if (log.getBust()) {
            break; 
        }
        game.nextPlayer();
        i++;
        
    }
        game.setResult();
        view.displayResult();

  }    
}