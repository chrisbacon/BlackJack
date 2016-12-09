import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class HandTest {

    Hand hand;
    Card card;

    @Before
    public void before() {
        hand = new Hand();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void canGetSize() {
        assertEquals(0, hand.getSize());
    }
}