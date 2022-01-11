import java.util.ArrayList;
import java.util.Collections;

/**
 * Class to store an ArrayList of many cards, and to contain actions consistant
 * of a draw pile.
 */
public class Deck {
    public static final int CARDS_IN_SUIT = 13;
    ArrayList<Card> contents = new ArrayList<Card>();

    /**
     * Helper method to make 13 new cards with nubers 1-13
     * 
     * @param suit - The suit of the card represented as a char
     * 
     */
    private void newSuit(char suit) {
        for (int i = 1; i <= CARDS_IN_SUIT; i++) {
            Card newCard = new Card(suit, i);
            contents.add(newCard);
        }
    }

    private void newFullDeck() {
        char suit;

        suit = 's';
        newSuit(suit);

        suit = 'c';
        newSuit(suit);

        suit = 'h';
        newSuit(suit);

        suit = 'd';
        newSuit(suit);
    }

    /**
     * Constructor
     * 
     * @param numCards
     */
    public Deck(int numCards) {
        if (numCards == 52) {
            newFullDeck();
        } else if (numCards == 54) {
            newFullDeck();
            //TODO Add jokers
        }
    }

    public Card drawTopCard() {
        return contents.remove(0);
    }

    /**
     * Shuffles the deck
     */
    public void shuffle() {
        Collections.shuffle(contents);
    }

    /**
     * Parses the data into a human readable format
     */
    public String toString() {
        String stringDeck = "";

        for (Card card : contents) {
            stringDeck = stringDeck + card.toString() + "\n";
        }

        return stringDeck;
    }
}