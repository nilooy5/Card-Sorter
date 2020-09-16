public class Driver {
    public static void main(String[] args) {

        Card card1 = new Card(1,12);
        Card card2 = new Card(3,2);

        String result;
        if(card1.compareTo(card2) > 0) result = "bigger";
        else result = "smaller";

        System.out.println(card1.toString() + " is " + result + " than " + card2.toString());
    }
}
