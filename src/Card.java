/**
 * Class to store variables pertaining to a single card
 */
public class Card implements Cloneable{

    /**
     * Array to store the string values of the card withe their index - 1
     */
    public static final String[] STRING_VALUES = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};

    /**
     * Stoes the number of cards
     */
    public static int numberOfCards = 0;

    /**
     * Stores the number on the card. Face cards are 11-13 for Jack - King.
     * Aces are 1.
     */
    private int number;

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
     * @param suit      First letter of the suit stored as a char.
     * @param number    The number of the card. Face cards are stored as 11, 12, 13.
     *                  Aces are stored as 1.
     * @param isFlipped Represents the publicity. True if everyone can see the card.
     *                  false otherwise.
     */
    public Card(char suit, int number, boolean isFlipped) {
        this.number = number;
        this.suit = suit;
        this.isFlipped = isFlipped;
        numberOfCards++;
    }

    /**
     * Clones a card
     * @param c - card to clone
     */
    public Card(Card c){
        this(c.getCharSuit(), c.getNumber(), c.getFlipStatus());
    }

    /**
     * override clone method
     * @param obj
     * @return
     */
    @Override
    public Object clone(){
        try{
            Card clone = (Card) super.clone();
            // clone.numberOfCards++;
            return clone;
        }
        catch(CloneNotSupportedException e){
            System.out.println("unhelpful error");
            return this;
            
        }
    }

    /**
     * Custom Clone method
     * @param c
     * @return
     */
    public void makeClone(Card c){
        this.suit = c.getCharSuit();
        this.number = c.getNumber();
        this.isFlipped = c.getFlipStatus();
    }

    /**
     * 
     * @param suit
     * @param number
     */
    public Card(char suit, int number) {
        this(suit, number, false);
    }

    /**
     * Override equals method
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        else if (obj.getClass() != this.getClass()){
            return false;
        }
        else {
            Card c = (Card) obj;
            return this.getCharSuit() == c.getCharSuit() &&
                this.getNumber() == c.getNumber() &&
                this.getFlipStatus() == c.getFlipStatus();
        }
    }

    /**
     * Accessor method for suits
     * 
     * @return the suit of the card
     */
    public String getSuit() {
        if (suit == 's') {
            return "Spade";
        } else if (suit == 'c') {
            return "Club";
        } else if (suit == 'h') {
            return "Heart";
        } else if (suit == 'd') {
            return "Diamond";
        } else {
            return "error";
        }
    }

    /**
     * Accesor for char of suite
     * @return char of suite
     */
    public char getCharSuit(){
        return suit;
    }


    /**
     * Accessor for the value of the number as an Int.
     * 
     * @return The value of the number as an int.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Accessor method for the isflipped variable
     * 
     * @return - true if the card is public and flipped, false otherwise.
     */
    public boolean getFlipStatus() {
        return isFlipped;
    }

    /**
     * Return a nicely formatted string in the "X of Y" format, where x = number and
     * y = suit of the card.
     */
    public String toString() {
        String valueOfCard = STRING_VALUES[number - 1];

        return valueOfCard + " of " + this.getSuit() + "s";

    }
}