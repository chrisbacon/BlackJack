import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Chris");
    }

    @Test
    public void canGetName() {
        assertEquals("Chris", player.getName());
    }

    @Test
    public void canGetHandSize() {
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void canAddCardToHand() {
        Card card = mock(Card.class);
        player.addCardToHand(card);
        assertEquals(1,player.getHandSize());
    }

    @Test
    public void canReturnHandToDealer() {
        Card card1 = mock(Card.class);
        Card card2 = mock(Card.class);

        player.addCardToHand(card1);
        player.addCardToHand(card2);


        Deck deck = new Deck();
        Dealer dealer = new Dealer("Logan", deck);

        player.returnHandToDealer(dealer);

        assertEquals(0, player.getHandSize());
        assertEquals(2, dealer.getDeckSize());
    }

    @Test
    public void canGetHandValue() {
        Card card1 = new Card(Suit.SPADES, Rank.ACE);
        Card card2 = new Card(Suit.HEARTS, Rank.FIVE);
        player.addCardToHand(card1);
        player.addCardToHand(card2);

        Rules rules = new Rules();

        assertEquals(16, player.getHandValue(rules));

    }
}