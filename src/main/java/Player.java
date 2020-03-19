import java.awt.print.Book;
import java.util.ArrayList;

public class Player {

    public String name;
    public Card card;
    public ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();

    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void addCardToPlayersHand(Deck deck){
        Card newCard = deck.dealACard();
        this.hand.add(newCard);
    }

}

