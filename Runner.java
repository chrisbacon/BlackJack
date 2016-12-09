import cardGame.*;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Blackjack game = new Blackjack();

    game.addPlayer("Chris");
    game.addDealer("Logan");

    game.dealCardsToPlayers();

    System.out.println(game.findWinner());
  }
    
}