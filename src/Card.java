import java.util.Random;

public class Card implements Comparable {
    private final int suit;
    private final int rank;

    public String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    public String[] ranks = {"invalid", "invalid", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Card (int newSuit, int newRank) {
        suit = newSuit;
        rank = newRank;
    }

    public static Card randomCard() {
        return new Card(generateSuit(),generateRank());
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

    @Override
    public int compareTo(Object temp) {
        Card other = (Card) temp;

        if (getSuit() == ((Card) temp).getSuit()) {
            if (getRank() > ((Card) temp).getRank()) {
                return 1;
            } else if (getRank() == ((Card) temp).getRank()) {
                return 0;
            } else return -1;
        } else if (getSuit() > ((Card) temp).getSuit()) {
            return 1;
        } else return -1;
    }

    private static int generateRank() {
        Random rankRand = new Random();
        int low = 2;
        int high = 15;
        int rank = rankRand.nextInt(high-low) + low;
        return rank;
    }

    private static int generateSuit() {
        Random suitRand = new Random();
        int low = 0;
        int high = 4;
        int suit = suitRand.nextInt(high-low) + low;
        return suit;
    }

}
