import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStarsEmpty() {
        assertEquals(0, deck.countCardsInDeck());
    }

    @Test
    public void return52Cards(){
        deck.add52Cards();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void notShuffledCards(){
        deck.add52Cards();
        assertEquals(deck.getCards().get(0).getValueFromEnum(), 1);
//        Maybe return to check suit at later stage
//        assertEquals(deck.getCards().get(0).value);
    }

    @Test
    public void shuffleCards(){
        deck.add52Cards();
        deck.shuffleCards();
        assertNotEquals(deck.getCards().get(0).getValueFromEnum(), 1);
    }

    @Test
    public void canDealCard(){
        deck.add52Cards();
        deck.shuffleCards();
        Card card1 = deck.dealACard();
        Card card2 = deck.dealACard();
        assertNotEquals(card1, card2);
    }


}
