/**
 * A class to expierment with the other classes
 */
public class TestCases {

    public static void main(String[] args) {
        // Deck d = new Deck(52);

        /*
        // System.out.println(d.drawTopCard());
        // System.out.println();
        // System.out.println(d);

        Card a = new Card('c',2);
        // System.out.println(a);

        System.out.println(Card.numberOfCards);

        Card b = new Card(a);
        // System.out.println(b);
        System.out.println(Card.numberOfCards);
        
        Card c = (Card) a.clone();
        // System.out.println(c);
        System.out.println(Card.numberOfCards);

        Card d = new Card ('d', 4, false);
        // System.out.println(d);
        // d.makeClone(a);
        // System.out.println(d);
        System.out.println(Card.numberOfCards);
        
        // System.out.println(a.equals(a));
        // System.out.println(a.equals(b));
        // System.out.println(a.equals(c));
        // System.out.println(a.equals(d));
        */

        Deck a = new Deck(52);
        Deck b = (Deck) a.clone();
        System.out.println(a + "\nNOW SHUFFLED:");
        a.shuffle();
        System.out.println(a);

        System.out.println();
        System.out.println(b);


    }
    
}
