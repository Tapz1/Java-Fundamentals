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

/*
    private RoomData room1;
    private RoomData room2;
    private RoomData room3;
    private RoomData room4;
    private RoomData room5;
    private RoomData room6;
    private RoomData room7;
    private RoomData room8;

    public RoomObjects(){
        this.room1 = new RoomData(
                "You suddenly wake up and find yourself in a room full of cat paintings. " +
                        "You see two doors. One on each side of the room.",
                "You're back in the room you woke up in with the cat paintings.");;
        this.room2 = new RoomData(
                "You're in a walk-in closet, but you've never seen one so big. " +
                        "There's jewelry and other valuables all around. There's also a a bronze-looking key hanging on a hook.",
                "You're in the large walk-in closet full of jewelry and other valuables.");
        this.room3 = new RoomData(
                "You're in a room full of shoes! " +
                        "As you inspect the room, you can see racks of sneakers, boots and slippers up against " +
                        "the wall in front of you and on the wall to your left." +
                        " This room has two doors.",
                "It's a room full of shoes!");
        this.room4 = new RoomData(
                "You find yourself in a long hallway with " +
                        "two doors. One at the end of the hallway and another door to the right of it. " +
                        "You also notice a musty smell and which is probably emitting from the old couch to your left. " +
                        "Man, it looks like it hasn't been used in years!",
                "You're in that hallway with that musty old couch and two doors. ");
        this.room5 = new RoomData(
                "You're in a utility closet with some tools on the floor and some on the shelves. " +
                        "As you look around you spot a flashlight on the floor.",
                "You're in a utility closet with some tools on the floor and some on the shelves.");
        this.room6 = new RoomData(
                "Upon opening the door you see a guard. But it looks like he's asleep. " +
                        "You'll need to be super quiet getting around him. You spot two other doors in this room.",
                "You're in a room with the sleeping guard and two doors. One door has a rather large padlock on it.");
        this.room7 = new RoomData(
                "This room is pitch-black, you can't see a thing! You try flickering the light switch but nothing happens.",
                "This room is pitch-black, you can't see a thing!");
        this.room8 = new RoomData(
                "You escaped from the house!",
                "You escaped from the house!");
    }

    */
/* Room One *//*


    public void setRoom1(Character user) {
        user.setLocation("Room1");
        room1.addDirection("N", null);
        room1.addDirection("S", null);
        room1.addDirection("E", "Room2"); // points to room 2
        room1.addDirection("W", "Room3"); // points to room 3

    }

    public RoomData getRoom1() {
        return this.room1;
    }



    */
/* Room Two *//*


    public void setRoom2(Character user) {
        user.setLocation("Room2");
        room2.addItems("Room 3 Key");
        room2.addDirection("N", null);
        room2.addDirection("S", null);
        room2.addDirection("E", null);
        room2.addDirection("W", "Room1"); // points to room 1

    }

    public RoomData getRoom2() {
        return room2;
    }



    */
/* Room Three *//*

    public void setRoom3(Character user) {
        user.setLocation("Room3");
        room3.addItems("soft slippers");
        room3.addDirection("N", "Room4"); // points to room 4 only if key is in inventory
        room3.addDirection("S", null);
        room3.addDirection("E", "Room1");  // points to room 1
        room3.addDirection("W", null);
    }

    public RoomData getRoom3() {
        return room3;
    }

    */
/* Room Four *//*

    public void setRoom4(Character user) {
        user.setLocation("Room4");
        room4.addDirection("N", null);  // points to room 5
        room4.addDirection("S", null);  // points to room 3
        room4.addDirection("E", null);  // points to room 6
        room4.addDirection("W", null);
    }

    public RoomData getRoom4() {
        return room4;
    }

*/

/*
    */
/* Room Five *//*

    public void setRoom5(Character user) {
        user.setLocation("Room5");
        room5.addItems("flashlight");
        room5.addDirection("N", null);
        room5.addDirection("S", room4.roomObjects);  // points to room 4
        room5.addDirection("E", null);
        room5.addDirection("W", null);
    }

    public RoomData getRoom5() {
        return room5;
    }


    */
/* Room Six *//*

    public void setRoom6(Character user) {
        user.setLocation("Room6");
        room6.addDirection("N", room8.roomObjects); // points to room 8 only if key is in inventory
        room6.addDirection("S", null);
        room6.addDirection("E", room7.roomObjects); // points to room 7 only if slippers are in inventory
        room6.addDirection("W", room4.roomObjects);  // points to room 4
    }

    public RoomData getRoom6() {
        return room6;
    }


    */
/* Room Seven *//*

    public void setRoom7(Character user) {
        user.setLocation("Room7");
        room7.addItems("Room 6 Key"); // only add to userItems if contains flashlight
        room7.addDirection("N", null);
        room7.addDirection("S", null);
        room7.addDirection("E", null);
        room7.addDirection("W", room6.roomObjects);  // points to room 6
    }

    public RoomData getRoom7() {
        return room7;
    }


    */
/* Room Eight - end *//*

    public void setRoom8(Character user) {
        user.setLocation("Room8");
        room8.addDirection("N", null);
        room8.addDirection("S", null);
        room8.addDirection("E", null);
        room8.addDirection("W", null);
    }

    public RoomData getRoom8() {
        return room8;
    }
*/



}
