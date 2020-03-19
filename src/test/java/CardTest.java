import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.FIVE);
    }

    @Test
    public void suitTypeClubs(){
        assertEquals(SuitType.CLUBS, card.getSuitType());
    }

    @Test
    public void rankTypeFive(){
        assertEquals(RankType.FIVE, card.getRankType());
    }

    @Test
    public void getValue(){
        assertEquals(5, card.getValueFromEnum());
    }

}
