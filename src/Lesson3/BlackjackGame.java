package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue() {
        return switch (rank) {
            //Get values of special cards
            case "Jack", "Queen", "King" -> 10;
            case "Ace" -> 11;
            default -> Integer.parseInt(rank);
        };
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffle();
    }

    private void shuffle() {
        Random rand = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(cards.size() - 1);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}

class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getTotalValue() {
        int total = 0;
        int aces = 0;
        for (Card card : cards) {
            total += card.getValue();
            if (card.toString().startsWith("Ace")) {
                aces++;
            }
        }
        // Adjust for Aces if total is over 21
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }
        return total;
    }

    public boolean isBust() {
        return getTotalValue() > 21;
    }

    public int getCardCount() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}

class Player {
    private Hand hand;

    public Player() {
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public boolean twist(Deck deck) {
        if (hand.getTotalValue() < 21 && hand.getCardCount() < 5) {
            Card newCard = deck.drawCard();
            if (newCard != null) {
                hand.addCard(newCard);
                return true;
            } else {
                System.out.println("Error: Deck is empty. Please open a new deck.");
                return false;
            }
        } else {
            System.out.println("Cannot twist: Hand is either bust or has 5 cards.");
            return false;
        }
    }

    public boolean stick() {
        return hand.getCardCount() >= 2 && !hand.isBust();
    }
}

class Dealer {
    private Hand hand;

    public Dealer() {
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public void play(Deck deck) {
        while (hand.getTotalValue() < 17) {
            hand.addCard(deck.drawCard());
        }
    }
}

//Class for the Game
public class BlackjackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Player player = new Player();

        //Deal cards at the start of the game
        for (int i = 0; i < 2; i++) {
            player.getHand().addCard(deck.drawCard());
            dealer.getHand().addCard(deck.drawCard());
        }

        while (true) {
            System.out.println("Your hand: " + player.getHand());
            System.out.println("Dealer's visible card: " + dealer.getHand().getTotalValue());
            System.out.println("Your total value: " + player.getHand().getTotalValue());

            System.out.print("Do you want to twist or stick? (t/s): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("t")) {
                player.twist(deck);
                if (player.getHand().isBust()) {
                    System.out.println("You bust! Your total value: " + player.getHand().getTotalValue());
                    return;
                }
            } else if (choice.equalsIgnoreCase("s")) {
                if (player.stick()) {
                    break;
                } else {
                    System.out.println("Cannot stick: Must have at least 2 cards and not be bust.");
                }
            } else {
                System.out.println("Invalid choice. Please enter 't' to twist or 's' to stick.");
            }
        }

        System.out.println("Dealer's turn...");
        dealer.play(deck);
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer's total value: " + dealer.getHand().getTotalValue());

        int playerTotal = player.getHand().getTotalValue();
        int dealerTotal = dealer.getHand().getTotalValue();

        //check for winner
        if (dealerTotal > 21) {
            System.out.println("Dealer busts! You win!");
        } else if (playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
