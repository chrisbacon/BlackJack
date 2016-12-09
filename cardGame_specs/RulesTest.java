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
        int [] values = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11};
        rules = new Rules(values);
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void canGetCardValue() {
        assertEquals(11, rules.getCardValue(card));
    }
}