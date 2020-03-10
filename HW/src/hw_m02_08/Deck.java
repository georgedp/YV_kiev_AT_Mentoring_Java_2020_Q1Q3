package hw_m02_08;
import java.util.*;

public class Deck {
//    1.a. Extend previous task by adding a new class named Deck which is holding a full deck of cards. Write a third class with
//    main method to test you Deck. The Deck class should be able to draw a card one by one till the deck ends

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}