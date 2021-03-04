package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {

    char[] suit = {'♠', '♦', '♥', '♣'};
    String[] cVals = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    int cardValue, suitValue;

    public Card(int cardValue, int suitValue){
        this.cardValue = cardValue;
        this.suitValue = suitValue;
    }

    @Override
    public String toString() {
        return cVals[cardValue] + " of " +
                suit[suitValue];
    }
}
