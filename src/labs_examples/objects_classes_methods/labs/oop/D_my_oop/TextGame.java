package labs_examples.objects_classes_methods.labs.oop.D_my_oop;



import java.lang.reflect.Array;
import java.util.ArrayList;

public class TextGame {
}


enum Location{
    ROOM1("You suddenly wake up and find yourself in a room full of cat paintings. " +
            "You see a door to the left of you facing West and a bookshelf to your right facing East.",
            "You're back in the room yu woke up in with the cat paintings. Door facing East" +
                    " and that bookshelf on your right facing East"),
    ROOM2("You suddenly wake up and find yourself in a room full of cat paintings. " +
            "You see a door to the left of you facing East and a bookshelf to your right facing West.",
            "You enter through the door facing East. It's like a secret entrance full of jewelry" +
                    " and other valuables with no windows or doors."),
    ROOM3("You enter through the door facing West. It's a room full of shoes! " +
            "Racks of sneakers, boots and slippers up against the wall in front of you and on the wall to your left." +
            " There's also a door to your right facing North.",
            "It's a room full of shoes!"),
    ROOM4("You enter through the door facing North and find yourself in a longer room with another " +
            "strange looking painting of a cat directly " +
            "across from you on the wall and door to your right facing East. " +
            "You also notice a musty old couch to your left that looks like it hasn't been used in years.",
            "You're in that room with the musty old couch, picture of the cat in front of you facing North" +
                    " and a door to your right facing East."),
    ROOM5("It's a utility closet with some tools on the floor and some on the shelves. " +
            "You notice a flashlight and test it out to make sure it works.",
            "It's a utility closet with some tools on the floor and some on the shelves."),
    ROOM6("As you open the door, you see a guard. But upon closer inspection, " +
            "you notice they're passed out asleep. You can spot a door with a padlock on it to your left facing North " +
            "and door straight across from you facing East.",
            "You're back in the room with the guard. Phew, they're still sleeping. " +
                    "Door with padlock facing North, a door facing West and another door facing East."),
    ROOM7("This room is pitch-black, you can't see a thing! " +
            "You try flickering the light switch but nothing happens.", "");

    private final String longDescription;
    private final String shortDescription;
    //private final Location NorthExit;



    Location(String longDescription, String shortDescription) {
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        //this.NorthExit = NorthExit;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}



class Character{
    Location location;
    private String name;
    private Items items;
    private ArrayList<String> rooms = new ArrayList<>();
    //Skills skills;


    public Character(String name, Items items, Location location/*, Skills skills*/){
        this.name = name;
        this.items = items;
        this.location = location;
        //this.skills = skills;

    }

    public void addRoom(String room) {
        this.rooms.add(room);
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Items{
    ArrayList<String> items = new ArrayList<>();

    public Items(){
        //this.myItems = addItems();
    }

    public void addItems(String item){
        this.items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void printItems(Character user){
        for(String item : this.items){
            System.out.println(user.getName() + " received a " + item);
        }
    }
}


class RoomDescriptions{


}

/*
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
*/
