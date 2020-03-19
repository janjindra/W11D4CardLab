
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    //Declaration
    private ArrayList<Card> cards;

    //Constructor
    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCardsInDeck(){
        return this.cards.size();
    }

    public void add52Cards() {
        for (SuitType s : SuitType.values()) {
            for (RankType r : RankType.values()) {
                cards.add(new Card(s, r));
            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

//    public int getRandomElement(List<Integer> list)
//    {
//        Random rand = new Random();
//        return list.get(rand.nextInt(list.size()));
//    }

    public Card dealACard(){
        Random rand = new Random();
        Card chosenCard = cards.get(rand.nextInt(cards.size()));
        removeCardFromDeck(chosenCard);
        return chosenCard;
    }

    public void removeCardFromDeck(Card card){
        cards.remove(card);
    }

}
