import java.util.HashMap;

public class CardGame {

    static final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    static final String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static void main(String[] args) {
        // Create a HashMap to store the ordering of the cards
        HashMap<String, Integer> cardOrder = new HashMap<>();
        int order = 1;

        // Assign order to the cards based on the rules
        for (String suit : suits) {
            for (String value : values) {
                String card = value + " of " + suit;
                cardOrder.put(card, order++);
            }
        }

        // Samuel's card
        String samuelCard = "10 of Clubs";

        // Andrew's cards (assuming they are in ascending order)
        String[] andrewCards = {"2 of Hearts", "5 of Diamonds", "Jack of Spades"};

        // Determine who should go next
        int samuelOrder = cardOrder.get(samuelCard);
        int andrewOrder = cardOrder.get(andrewCards[0]);

        if (samuelOrder < andrewOrder) {
            System.out.println("Samuel should go next.");
        } else {
            System.out.println("Andrew should go next.");
        }
    }
}
