import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import cardGame.*;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void canGetSize() {
        assertEquals(0, deck.getSize());
    }

    @Test
    public void canAddCard() {
        deck.addCard(card);
        assertEquals(1, deck.getSize());
    }

    @Test
    public void canDealCard() {
        deck.addCard(card);

        Card dealtCard = deck.dealCard();
        assertEquals(card, dealtCard);
        assertEquals(0, deck.getSize());
    }

    @Test
    public void canBuildDeck() {
        deck.buildDeck();
        assertEquals(52, deck.getSize());
    }
}