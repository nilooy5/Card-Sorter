public class Driver {
    public static void main(String[] args) {

        Card card1 = Card.randomCard();
        Card card2 = new Card(3,14);

        String result;
        if(card1.compareTo(card2) > 0) result = "bigger";
        else result = "smaller";

        System.out.println(card1.toString() + " is " + result + " than " + card2.toString());
    }
}
