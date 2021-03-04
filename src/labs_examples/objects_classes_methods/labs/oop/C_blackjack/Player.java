package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;    // name of the player
    Hand hand;      // hand of the player
    int potValue;   // how much the player has (betting pot)

    public Player(String name, Hand hand, int potValue){
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }


    public boolean computerAI(){
        return hand.handValue < 16;
    }



}
