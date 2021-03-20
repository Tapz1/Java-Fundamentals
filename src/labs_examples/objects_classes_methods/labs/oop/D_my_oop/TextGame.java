package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TextGame {
}



class Character{
    String name;
    Skills skills;
    UserItems items;

    public Character(String name, Skills skills){
        this.name = name;
        this.skills = skills;
        //this.items = items;
    }
}


class Skills{
    int attack;
    int defense;
    int health;

    public Skills(){
        this.attack = 0;
        this.defense = 0;
        this.health = 50;
    }

    public int attackIncrease(int increaseAmount){
        this.attack += increaseAmount;
        System.out.println("Your attack has increased by " + increaseAmount);

        return this.attack;
    }

    public int defenseIncrease(int increaseAmount){
        this.defense += increaseAmount;
        return this.defense;
    }

    public int healthIncrease(int increaseAmount){
        this.health += increaseAmount;
        return this.health;
    }

    public int healthDecrease(int decreaseAmount){
        this.health -= decreaseAmount;
        return this.health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

class Items{
    String[] weapons = {"frying pan", "kitchen knife", "combat knife", "hatchet", "modern hatchet"};
    //String[] items = {};
    // add item types, enum?

    public Items(String[] weapons){
        this.weapons = weapons;
    }
}

class UserItems{
    ArrayList<String> myItems = new ArrayList<>();

    public UserItems(){
        //this.myItems = addItems();
    }
   /*
    public static void addItems(Character user, String item){
        user.items.myItems.add(item);
    }
*/

    public void displayItems(Character user){
        for(String item : this.myItems){
            System.out.println(user.name + " received a " + item);
        }
    }
}



