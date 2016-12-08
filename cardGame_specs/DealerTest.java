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
        dealer = new Dealer(deck);
    }

    @Test
    public void canGetDeckSize() {
        assertEquals(52, dealer.getDeckSize());
    }
}