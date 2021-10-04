import java.util.ArrayList;

public class Deck{
    ArrayList<Card> contents = new ArrayList<Card>();


    /**
     * Constructor
     * @param numCards
     */
    public Deck(int numCards){
        if (numCards == 52){

            char suit = 's';
            for(int i = 0; i < numCards/4; i++){

                Card newCard = new Card(suit, i);
                contents.add(newCard);
            }
        }
    }

    /**
     * Parses the data into a human readable format
     */
    public String toString(){
        return "Card";
    }
}