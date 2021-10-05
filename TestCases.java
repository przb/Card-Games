public class TestCases {

    public static void main(String[] args) {
        //char suit = 's';
        //Card card = new Card(suit, 13);
        //System.out.println(card);

        Deck d = new Deck(52);

        //d.shuffle();

        //System.out.println(d);

        System.out.println(d.drawTopCard());
        System.out.println();
        System.out.println(d);
    }
    
}
