package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomObjects {

    private RoomData roomData = new RoomData();



/*
    public RoomObjects(){
        //this.roomData = new RoomData(roomName(room), longDescription(room),shortDescription(room), roomItems(roomData, room),
                //roomDirections(roomData, room));
        this.roomData = roomData;
    }
*/



    public void roomDirections(String room){
        if(room.equals("room1")){
            roomData.addDirection("N", null);
            roomData.addDirection("S", null);
            roomData.addDirection("E", "room2");
            roomData.addDirection("W", "room3");
            //return roomData.getDirection();
        }
        else if(room.equals("room2")){
            roomData.addDirection("N", null);
            roomData.addDirection("S", null);
            roomData.addDirection("E", null);
            roomData.addDirection("W", "room1");
            //return roomData.getDirection();
        }
        else if(room.equals("room3")){
            roomData.addDirection("N", "room4");
            roomData.addDirection("S", null);
            roomData.addDirection("E", "room1");
            roomData.addDirection("W", null);
            //return roomData.getDirection();
        }
        else if(room.equals("room4")){
            // no items
            roomData.addDirection("N", "room5");  // points to room 5
            roomData.addDirection("S", "room3");  // points to room 3
            roomData.addDirection("E", "room6");  // points to room 6
            roomData.addDirection("W", null);
            //return roomData.getDirection();
        }
        else if(room.equals("room5")){
            roomData.addDirection("N", null);
            roomData.addDirection("S", "room4");  // points to room 4
            roomData.addDirection("E", null);
            roomData.addDirection("W", null);
            //return roomData.getDirection();
        }
        else if(room.equals("room6")){
            roomData.addDirection("N", "room8"); // points to room 8 only if key is in inventory
            roomData.addDirection("S", null);
            roomData.addDirection("E", "room7"); // points to room 7 only if slippers are in inventory
            roomData.addDirection("W", "room4");  // points to room 4
            //return roomData.getDirection();
        }else if(room.equals("room7")){
            roomData.addDirection("N", null);
            roomData.addDirection("S", null);
            roomData.addDirection("E", null);
            roomData.addDirection("W", "room6");  // points to room 6
            //return roomData.getDirection();
        }else if(room.equals("room8")){
            roomData.addDirection("N", null);
            roomData.addDirection("S", null);
            roomData.addDirection("E", null);
            roomData.addDirection("W", null);
            //return roomData.getDirection();

        }
        else{
            //return roomData.getDirection();
        }
    }


    public void roomItems(String room){
        switch (room) {
            case "room1":
                // No items in here
                //return this.roomData.getItems();
                break;
            case "room2":
                this.roomData.addItems("Shoe Room Key");
                //return this.roomData.getItems();
                break;
            case "room3":
                this.roomData.addItems("Soft Slippers");
                //return this.roomData.getItems();
                break;
            case "room4":
                // no items
                //return this.roomData.getItems();
                break;
            case "room5":
                this.roomData.addItems("Flashlight");
                //return this.roomData.getItems();
                break;
            case "room6":
                // no items in here
                //return this.roomData.getItems();
                break;
            case "room7":
                this.roomData.addItems("Guard Room - Padlock Key");
                //return this.roomData.getItems();
                break;
            case "room8":
                // no items
                //return this.roomData.getItems();
                break;
            default:
                //return this.roomData.getItems();
                break;
        }
    }

    public String roomName(String room){
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

    public String longDescription(String room){
        if(room.equals("room1")){
            return "You suddenly wake up and find yourself in a room full of cat paintings. " +
                    "You see two doors. One on each side of the room.";
        }
        else if(room.equals("room2")){
            return "You're in a walk-in closet, but you've never seen one so big. " +
                    "There's jewelry and other valuables all around. " +
                    "There's also a a bronze-looking key hanging on a hook.";
        }
        else if(room.equals("room3")){
            return "You're in a room full of shoes! " +
                    "As you inspect the room, you can see racks of sneakers, boots and slippers up against " +
                    "the wall in front of you and on the wall to your left." +
                    " This room has two doors.";
        }
        else if(room.equals("room4")){
            return "You find yourself in a long hallway with " +
                    "two doors. One at the end of the hallway and another door to the right of it. " +
                    "You also notice a musty smell and which is probably emitting from the old couch to your left. " +
                    "Man, it looks like it hasn't been used in years!";
        }
        else if(room.equals("room5")){
            return "You're in a utility closet with some tools on the floor and some on the shelves. " +
                    "As you look around you spot a flashlight on the floor.";
        }
        else if(room.equals("room6")){
            return "Upon opening the door you see a guard. But it looks like he's asleep. " +
                    "You'll need to be super quiet getting around him. You spot two other doors in this room.";
        }else if(room.equals("room7")){
            return "This room is pitch-black, you can't see a thing! You try flickering the light switch but nothing happens.";
        }else if(room.equals("room8")){
            return "You've escaped from the house!";
        }else{
            return "";
        }

    }

    public String shortDescription(String room){
        if(room.equals("room1")){
            return "You're back in the room you woke up in with the cat paintings.";
        }
        else if(room.equals("room2")){
            return "You're in the large walk-in closet full of jewelry and other valuables.";
        }
        else if(room.equals("room3")){
            return "It's a room full of shoes!";
        }
        else if(room.equals("room4")){
            return "You're in that hallway with that musty old couch and three doors. ";
        }
        else if(room.equals("room5")){
            return "You're in a utility closet with some tools on the floor and some on the shelves.";
        }
        else if(room.equals("room6")){
            return "You're in a room with the sleeping guard and two doors. One door has a rather large padlock on it.";
        }else if(room.equals("room7")){
            return "This room is pitch-black, you can't see a thing!";
        }else if(room.equals("room8")){
            return "You've escaped from the house!";
        }else{
            return "";
        }

    }

    public void setRoomItems(String room){

    }




}
