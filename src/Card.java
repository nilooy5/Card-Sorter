
public class Card implements Comparable {
    private int suit;
    private int rank;

    public String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    public String[] ranks = {"invalid", "invalid", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Card (int newSuit, int newRank) {
        suit = newSuit;
        rank = newRank;
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
            } else return -1;
        } else if (getSuit() > ((Card) temp).getSuit()) {
            return 1;
        } else return -1;
    }

}
