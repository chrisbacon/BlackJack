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
    public void canToString() {
        hand.addCard(card);
        Card card2 = new Card(Suit.HEARTS, Rank.FIVE);
        hand.addCard(card2);

        assertEquals("|A-S| |5-H|", hand.toString());
    }

    @Test
    public void canGetSize() {
        assertEquals(0, hand.getSize());
    }

    @Test
    public void canAddCard() {
        hand.addCard(card);
        assertEquals(1, hand.getSize());
    }

    @Test
    public void canReturnCardsToDealer() {
        //create mock dealer, add card to hand.
        Dealer dealerMock = mock(Dealer.class);
        hand.addCard(card);

        //method being tested
        hand.returnCardsToDealer(dealerMock);

        //assertions
        assertEquals(0, hand.getSize());
        verify(dealerMock, times(1)).addCardToDeck(card);
    }

    @Test
    public void canGetValue() {
        hand.addCard(card);
        Card card2 = new Card(Suit.HEARTS, Rank.FIVE);
        hand.addCard(card2);

        assertEquals(16, hand.getValue());

    }
}