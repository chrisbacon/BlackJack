import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class DealerTest {
    
    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("Logan", deck);
    }

    @Test
    public void canGetDeckSize() {
        assertEquals(52, dealer.getDeckSize());
    }

    @Test
    public void canAddCardToDeck() {
        Card card = mock(Card.class);
        dealer.addCardToDeck(card);
        assertEquals(53, dealer.getDeckSize());
    }
}