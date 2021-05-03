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
    private ArrayList<String> items = new ArrayList<>();
    //private HashMap<String, Boolean> direction;
    private HashMap<String, String> direction;

    public RoomData(String roomName, String longDescription, String shortDescription, ArrayList<String> roomItems){
        this.roomName = roomName;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.items = roomItems;
        this.direction = new HashMap<>();
    }




    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void addItems(String item){
        this.items.add(item);
    }

    public String getDirection(String directionChoice) {
        return this.direction.get(directionChoice);
       //return direction;
    }

    public void setDirection(HashMap<String, String> direction) {
        this.direction = direction;
    }

    public void addDirection(String direction, String value){
        this.direction.put(direction, value);
    }


}


class Character{
    private String name;
    private Items items;
    private ArrayList<String> rooms;
    private String location;
    Direction direction;
    RoomObjects roomObjects;
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




