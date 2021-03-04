package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        this.cards = new ArrayList<>();
        this.handValue = 0;

    }

    public int scoreHand() {
        this.handValue = 0;
        boolean hasAce = false;
        for (Card currentCard : this.cards) {

            if (currentCard.cardValue == 0) {
                if (this.handValue <= 10) {
                    this.handValue += 11;
                    hasAce = true;
                } else {
                    this.handValue += 1;
                }

            } else if (currentCard.cardValue >= 10) {
                this.handValue += 10;
            } else {
                this.handValue += (currentCard.cardValue + 1);
            }

        }

        // genius
        if (this.handValue > 21 && hasAce){
            this.handValue -= 10;
        }
        return this.handValue;
    }

    public boolean greaterThanTwentyOne(int handValue) {
        return handValue > 21;
    }

    @Override
    public String toString() {
        return cards +
                ", with a hand total of " + handValue;
    }
}
