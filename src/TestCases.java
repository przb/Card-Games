/**
 * A class to expierment with the other classes
 */
public class TestCases {

    public static void main(String[] args) {
        Deck d = new Deck(52);

        // System.out.println(d.drawTopCard());
        System.out.println();
        // System.out.println(d);

        Card c = new Card('s',2);
        System.out.println(c);
        Card b = new Card(c);
        System.out.println(b);
    }
    
}
