import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.add52Cards();
        deck.shuffleCards();
        player1 = new Player("Meredith");
        player2 = new Player("Jan");
    }


    @Test
    public void handOneCanGetACard(){
        player1.addCardToPlayersHand(deck);
        assertEquals(player1.hand.size(),1);
    }







}
