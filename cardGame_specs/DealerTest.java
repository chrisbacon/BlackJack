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
        assertEquals(0, dealer.getDeckSize());
    }

    @Test
    public void canAddCardToDeck() {
        Card card = mock(Card.class);
        dealer.addCardToDeck(card);
        assertEquals(1, dealer.getDeckSize());
    }
}