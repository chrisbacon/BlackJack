import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class RulesTest {

    @Test
    public void canGetCardValue() {
        assertEquals(11, Rules.getRankValue(Rank.ACE));
    }
}