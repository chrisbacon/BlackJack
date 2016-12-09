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

        Dealer dealer = mock(Dealer.class);

        player.returnHandToDealer(dealer);

        assertEquals(0, player.getHandSize());
        verify(dealer, times(2)).returnHandToDealer(dealer);
    }
}