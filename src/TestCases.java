/**
 * A class to expierment with the other classes
 */
public class TestCases {

    public static void main(String[] args) {
        // Deck d = new Deck(52);

        // System.out.println(d.drawTopCard());
        // System.out.println();
        // System.out.println(d);

        Card a = new Card('c',2);
        System.out.println(a);

        Card b = new Card(a);
        System.out.println(b);
        
        Card c = (Card) a.clone();
        System.out.println(c);

        Card d = new Card ('d', 4, false);
        System.out.println(d);
        d.makeClone(a);
        System.out.println(d);
    }
    
}
