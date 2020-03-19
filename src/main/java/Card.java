public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //getters
    public RankType getRankType(){
        return this.rank;
    }

    public SuitType getSuitType(){
        return this.suit;
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }


}
