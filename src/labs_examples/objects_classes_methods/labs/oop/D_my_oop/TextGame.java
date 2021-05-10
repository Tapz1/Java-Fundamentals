package labs_examples.objects_classes_methods.labs.oop.D_my_oop;



import labs_examples.enumerations.labs.Direction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TextGame {
}



class RoomData{
    Character user;
    //RoomObjects roomObjects;
    private String roomName;
    private String longDescription;
    private String shortDescription;
    private String[] items = new String[1];
    //private HashMap<String, Boolean> direction;
    private HashMap<String, String> direction = new HashMap<>();



    public RoomData(){

    }

    public void getInfo() {
        System.out.println(
                "Navigation:" +
                        "\nn = move north" +
                        "\ne = move east" +
                        "\ns = move south" +
                        "\nw = move west"
                );

    }

    public void menu() {
        System.out.println(
                "Enter a direction or choose an option: " +
                "\n1. Search room" +
                "\n2. View items" +
                "\n3. Room name" +
                "\n4. Room description" +
                "\n5. Direction options" +
                "\n6. Exit"
        );

    }

    public String[] getItems() {
        return items;
    }

    public void addItems(String item){
        this.items[0] = item;
    }


/*
    public String getDirectionValue(String directionChoice) {
        return direction.get(directionChoice);
    }
*/

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public HashMap<String, String> getDirection() {
        return direction;
    }

    public void setDirection(HashMap<String, String> direction) {
        this.direction = direction;
    }

    public void addDirection(String direction, String value){
        this.direction.put(direction, value);
    }

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setItems(String[] items) {
        this.items = items;
    }


    public void roomDirections(String room){
        switch (room) {
            case "room1":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", "room2");
                addDirection("W", "room3");
                //return roomData.getDirection();
                break;
            case "room2":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", "room1");
                //return roomData.getDirection();
                break;
            case "room3":
                addDirection("N", "room4");
                addDirection("S", null);
                addDirection("E", "room1");
                addDirection("W", null);
                //return roomData.getDirection();
                break;
            case "room4":
                // no items
                addDirection("N", "room5");  // points to room 5

                addDirection("S", "room3");  // points to room 3

                addDirection("E", "room6");  // points to room 6

                addDirection("W", null);
                //return roomData.getDirection();
                break;
            case "room5":
                addDirection("N", null);
                addDirection("S", "room4");  // points to room 4

                addDirection("E", null);
                addDirection("W", null);
                //return roomData.getDirection();
                break;
            case "room6":
                addDirection("N", "room8"); // points to room 8 only if key is in inventory

                addDirection("S", null);
                addDirection("E", "room7"); // points to room 7 only if slippers are in inventory

                addDirection("W", "room4");  // points to room 4

                //return roomData.getDirection();
                break;
            case "room7":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", "room6");  // points to room 6

                //return roomData.getDirection();
                break;
            case "room8":
                addDirection("N", null);
                addDirection("S", null);
                addDirection("E", null);
                addDirection("W", null);
                //return roomData.getDirection();

                break;
            default:
                //return roomData.getDirection();
                break;
        }
    }


    public void roomItems(String room){
        switch (room) {
            case "room1":
                // No items in here
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room2":
                this.addItems("Shoe Room Key");
                //return this.roomData.getItems();
                break;
            case "room3":
                this.addItems("Soft Slippers");
                //return this.roomData.getItems();
                break;
            case "room4":
                // no items
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room5":
                this.addItems("Flashlight");
                //return this.roomData.getItems();
                break;
            case "room6":
                // no items in here
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            case "room7":
                this.addItems("Guard Room - Padlock Key");
                //return this.roomData.getItems();
                break;
            case "room8":
                // no items
                this.addItems(null);
                //return this.roomData.getItems();
                break;
            default:
                //return this.roomData.getItems();
                break;
        }
    }

    public String nameOfRoom(String room){
        switch (room) {
            case "room1":
                return "Master Bedroom";
            case "room2":
                return "Bedroom Closet";
            case "room3":
                return "Shoe Room";
            case "room4":
                return "Hallway";
            case "room5":
                return "Utility Closet";
            case "room6":
                return "Guard Room";
            case "room7":
                return "Storage Room";
            case "room8":
                return "End";

            default:
                return "";
        }
    }

    public void setLongDescription(String room){
        switch (room) {
            case "room1":
                this.longDescription = ("You suddenly wake up and find yourself in a room full of cat paintings. " +
                        "You see two doors. One on each side of the room.");
                break;
            case "room2":
                this.longDescription = "You're in a walk-in closet, but you've never seen one so big. " +
                        "There's jewelry and other valuables all around. " +
                        "There's also a a bronze-looking key hanging on a hook.";
                break;
            case "room3":
                this.longDescription = "You're in a room full of shoes! " +
                        "As you inspect the room, you can see racks of sneakers, boots and slippers up against " +
                        "the wall in front of you and on the wall to your left." +
                        " This room has two doors.";
                break;
            case "room4":
                this.longDescription = "You find yourself in a long hallway with " +
                        "two doors. One at the end of the hallway and another door to the right of it. " +
                        "You also notice a musty smell and which is probably emitting from the old couch to your left. " +
                        "Man, it looks like it hasn't been used in years!";
                break;
            case "room5":
                this.longDescription = "You're in a utility closet with some tools on the floor and some on the shelves. " +
                        "As you look around you spot a flashlight on the floor.";
                break;
            case "room6":
                this.longDescription = "Upon opening the door you see a guard. But it looks like he's asleep. " +
                        "You'll need to be super quiet getting around him. You spot two other doors in this room.";
                break;
            case "room7":
                this.longDescription = "This room is pitch-black, you can't see a thing! You try flickering the light switch but nothing happens.";
                break;
            case "room8":
                this.longDescription = "You've escaped from the house!";
                break;
            default:
                this.longDescription = "";
        }
    }

    public void setShortDescription(String room){
        switch (room) {
            case "room1":
                this.shortDescription = "You're in the room you woke up in with the cat paintings.";
                break;
            case "room2":
                this.shortDescription = "You're in the large walk-in closet full of jewelry and other valuables.";
                break;
            case "room3":
                this.shortDescription = "It's a room full of shoes!";
                break;
            case "room4":
                this.shortDescription = "You're in that hallway with that musty old couch and three doors. ";
                break;
            case "room5":
                this.shortDescription = "You're in a utility closet with some tools on the floor and some on the shelves.";
                break;
            case "room6":
                this.shortDescription = "You're in a room with the sleeping guard and two doors. One door has a rather large padlock on it.";
                break;
            case "room7":
                this.shortDescription = "This room is pitch-black, you can't see a thing!";
                break;
            case "room8":
                this.shortDescription = "You've escaped from the house!";
                break;
            default:
                this.shortDescription = "";
        }

    }

    public void setRoomItems(String room){

    }





}


class Character{
    private String name;
    private Items items;
    private ArrayList<String> rooms;
    private String location;
    RoomData roomData;



    public Character(String name, Items items){
        this.name = name;
        this.items = items;
        this.rooms = new ArrayList<>();

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


class Items{
    ArrayList<String> items = new ArrayList<>();

    public Items(){
        //this.myItems = addItems();
    }

    public void addItems(Character user, String item){
        System.out.println(user.getName() + " received " + item);
        this.items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void printItems(){
        for(String item : this.items){
            System.out.println(item);
        }
    }
}




