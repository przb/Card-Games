/**
 * Class to store variables pertaining to a single card
 */
public class Card{

    
    /**
     * Stores the number on the card. Face cards are 11-13 for Jack - King. 
     * Aces are 1.
     */
    private byte number;

    /**
     * Stores the suite of the card.
     * 's' for spade. 'c' for club.
     * 'h' for heart. 'd' for diamond.
     */
    private char suit;

    /**
     * Stores the status of the card. If its public then it will be true
     */
    private boolean isFlipped;

    /**
     * 
     * @param suit First letter of the suit stored as a char.
     * @param number The number of the card. Face cards are stored as 11, 12, 13.
     * Aces are stored as 1.
     * @param isFlipped Represents the publicity. True if everyone can see the card.
     * false otherwise.
     */
    public Card(char suit, byte number, boolean isFlipped){
        this.number = number;
        this.suit = suit;
        this.isFlipped = isFlipped;
    }
/**
 * 
 * @param suit
 * @param number
 */
    public Card(char suit, int number){
        this(suit, (byte)number, false);
    }

    /**
     * Accessor method for suits
     * @return the suit of the card
     */
    public String getSuit(){
        if (suit == 's'){
            return "Spade";
        } else if (suit == 'c'){
            return "Club";
        } else if (suit == 'h'){
            return "Heart";
        } else if (suit == 'd'){
            return "Diamond";
        } else{
            return "error";
        }
    }

    /**
     * Accessor for the value of the number as an Int.
     * @return The value of the number as an int.
     */
    public int getValue(){
        return (int)number;
    }

    /**
     * Accessor method for the isflipped variable
     * @return - true if the card is public and flipped, false otherwise.
     */
    public boolean getFlipStatus(){
        return isFlipped;
    }

    /**
     * Return a nicely formatted string in the "X of Y" format, where x = number and y = suit of the card.
     */
    public String toString(){
        String valueOfCard;
        switch(number){
            case 1: 
                valueOfCard = "Ace";
                break;
            case 2: 
                valueOfCard = "Two";
                break;

            case 3: 
                valueOfCard = "Three";
                break;

            case 4: 
                valueOfCard = "Four";
                break;

            case 5: 
                valueOfCard = "Five";
                break;

            case 6: 
                valueOfCard = "Six";
                break;

            case 7: 
                valueOfCard = "Seven";
                break;

            case 8: 
                valueOfCard = "Eight";
                break;

            case 9: 
                valueOfCard = "Nine";
                break;

            case 10: 
                valueOfCard = "Ten";
                break;

            case 11: 
                valueOfCard = "Jack";
                break;

            case 12: 
                valueOfCard = "Queen";
                break;

            case 13: 
                valueOfCard = "King";
                break;

            default: 
                valueOfCard = "";
        }
        return valueOfCard + " of " + this.getSuit() + "s" ;


    }
}