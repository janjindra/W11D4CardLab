public class Runner {

        public static void main(String[] args){

            Deck deck = new Deck();
            deck.add52Cards();
            deck.shuffleCards();
            Player player1 = new Player("Meredith");
            Player player2 = new Player("Jan");

            player1.addCardToPlayersHand(deck);
            player2.addCardToPlayersHand(deck);

            System.out.println(player1.name + " has been dealt " + player1.hand.get(0).getValueFromEnum());
            System.out.println(player2.name + " has been dealt " + player2.hand.get(0).getValueFromEnum());

            if (player1.hand.get(0).getValueFromEnum() > player2.hand.get(0).getValueFromEnum()) {

                System.out.println(player1.name+" won!");
            } else if (player1.hand.get(0).getValueFromEnum() < player2.hand.get(0).getValueFromEnum()) {
                System.out.println(player2.name+" won!");
            }  else {
                System.out.println("It's a draw!");
            }




        }
    }


