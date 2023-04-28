// I certify the code of this lab is entirely my own work,
// Follow this with a description of the type of assistance (https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist).

import static java.util.Comparator.comparing;
import java.util.*;

public class Hand {
    public class Card{

        public final static int Clubs = 0;
        public final static int Diamond = 1;
        public final static int Hearts = 2;
        public final static int Spade = 3;

        public final static int A = 1;
        public final static int J = 11;
        public final static int Q = 12;
        public final static int K = 13;

        private final int suit;
        private final int value;

        public Card(int suit, int value) {
            if (suit != Clubs && suit != Diamond && suit != Hearts &&
                    suit != Spade)
                throw new IllegalArgumentException("Illegal playing card suit");
            if (value < 1 || value > 13)
                throw new IllegalArgumentException("Illegal playing card value");
            this.value = value;
            this.suit = suit;
        }

        public int getSuit() {
            return suit;
        }
        public int getValue() {
            return value;
        }

        public String getSuitAsString() {
            switch ( suit ) {
                case Spade:    return "Spade";
                case Hearts:   return "Heart";
                case Diamond:  return "Diamond";
                case Clubs:    return "Clubs";
                default:       return null;
            }
        }

        public String getValueAsString() {
            switch ( value ) {
                case 1:   return "A";
                case 2:   return "2";
                case 3:   return "3";
                case 4:   return "4";
                case 5:   return "5";
                case 6:   return "6";
                case 7:   return "7";
                case 8:   return "8";
                case 9:   return "9";
                case 10:  return "10";
                case 11:  return "J";
                case 12:  return "Q";
                default:  return "K";
            }
        }

        public String toString() {
            return getSuitAsString() + getValueAsString();
        }
    }

    private ArrayList<Card> hand;   // The cards in the hand.
    public Hand() {
        hand = new ArrayList<>();
        hand.add(new Card(0,1));
        hand.add(new Card(3,13));
        hand.add(new Card(2,12));
        hand.add(new Card(1,11));
        hand.add(new Card(0,10));
        hand.add(new Card(3,9));
        hand.add(new Card(2,8));
        hand.add(new Card(1,7));
        hand.add(new Card(0,6));
        hand.add(new Card(3,5));
        hand.add(new Card(2,4));
        hand.add(new Card(1,3));
    }

    public void sort(){
        hand.sort(comparing(Card::getValue));
        print();
    }

    public void shuffle(){
        Collections.shuffle(hand);
        print();
    }

    public void reverse(){
        hand.sort(comparing(Card::getValue).reversed());
        print();
    }

    public void print()
    {
        for(int k = 0; k < hand.size(); k++)
        {
            System.out.print(hand.get(k) +", ");
        }
    }

    public static void main(String[] args)
    {
        Hand cards = new Hand();
        System.out.println("\n\nSorted Deck");
        cards.sort();
        System.out.println("\n\nShuffled Deck");
        cards.shuffle();
        System.out.println("\n\nReversed Deck");
        cards.reverse();
        System.out.println("\n\nShuffled Deck");
        cards.shuffle();
    }
}

