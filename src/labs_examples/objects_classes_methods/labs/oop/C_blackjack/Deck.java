package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    ArrayList<Card> deckCards;
    ArrayList<Integer> usedCards;
    Player playa;

    public Deck(){
        this.deckCards = populateDeck();
        this.usedCards = new ArrayList<Integer>();
    }


    public ArrayList<Card> populateDeck(){
        ArrayList<Card> createDeck = new ArrayList<Card>();
        final int SETS = 13; // 13 sets of 4 unique cards
        final int SUITS = 4; // 4 types of suits

        for(int cardVal=0; cardVal<SETS; cardVal++){

            for(int suitVal=0; suitVal < SUITS; suitVal++){
                Card newCard = new Card(cardVal, suitVal);
                createDeck.add(newCard);

            }
        }
        return createDeck;
    }

    public void deal(Player playa){
        /* dealing cards to players while checking if the card hasn't been used*/
        int randomNum;
        do{
           randomNum = (int)(Math.random()*52); //random generates between 0-1 thus everything in decimal

        }while(usedCards.contains(randomNum));

        playa.hand.cards.add(deckCards.get(randomNum));
        System.out.println(playa.name + " has added a card...");

        usedCards.add(randomNum);

    }


/*
    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
*/
}
