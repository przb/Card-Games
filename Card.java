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
     * Constructor
     */
    public Card(char suit, byte number, boolean isFlipped){
        this.number = number;
        this.suit = suit;
        this.isFlipped = isFlipped;
    }

    public Card(char suit, int number){
        this(suit, (byte)number, false);
    }


    public String toString(){
        //TODO

        return "Hello there!";

    }
}