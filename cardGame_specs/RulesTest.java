import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class RulesTest {

    Rules rules;
    Card card;

    @Before
    public void before() {
        
        rules = new Rules();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void canGetCardValue() {
        assertEquals(11, card.getValue(rules));
    }
}