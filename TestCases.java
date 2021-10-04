public class TestCases {

    public static void main(String[] args) {
        char suit = 's';
        Card card = new Card(suit, 2);
        System.out.println(card);

        Deck d = new Deck(52);

        System.out.println(d);
    }
    
}
