import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card<?,?> card: d) { /* TODO
Compete a for loop that prints every card
in the deck d */
            System.out.println(card);
        }
    }

    public static int addCards(ArrayList<Card> hand){
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
        final String[] cardValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int result = 0;
        for (Card card: hand) {
            for (int i = 0; i < cardValues.length; i++) {
                if(card.getValue().toString().equals(cardValues[i])){
                    result += i + 1;
                }
            }
        }
        return result;
    }
}