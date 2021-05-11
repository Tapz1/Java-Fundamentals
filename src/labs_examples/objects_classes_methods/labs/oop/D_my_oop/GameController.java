package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GameController{
    /*The main game method*/

    /*
    add areas using a class to display:
     with short & long description depending if theyve been there before
    set objects, and enemies
    using arraylists
    if kilt, or equiped, remove from that area's list
    containing exits, ex: N = 0, E, W, S
     */

    public static void main(String[] args) {
        letsPlay();


    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }



    public static void letsPlay(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name: ");
        String userName = in.next();

        Items userItems = new Items();

        Character user = new Character(userName, userItems);

        // sets each run through from the beginning
        String roomName = "room1";

        /* setting up the first room object */
        RoomData newRoom = new RoomData();

        newRoom.nameOfRoom(roomName);
        newRoom.setLongDescription(roomName);
        newRoom.setShortDescription(roomName);
        newRoom.roomItems(roomName);
        newRoom.roomDirections(roomName);
        user.addRoom(roomName);

        System.out.println("---Game Start---");
        promptEnterKey();
        System.out.println(newRoom.getLongDescription());
        promptEnterKey();
        System.out.println("Enter what you would like to do \n(enter 'm' to view menu of options)");

        boolean isRunning = true;
        while(isRunning){

            String choice = in.next();
            switch ((choice).toUpperCase(Locale.ROOT)){
                case "M":
                    newRoom.menu();
                    break;
                case "N":
                    // north direction
                    try {
                        roomName = newRoom.getDirection().get("N"); // pulls the val of where room points

                        /** these ifs look for locked doors **/
                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);  // testing purposes
                        /** generates the new room object **/
                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);

                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }

                    break;
                case "E":
                    try {
                        roomName = newRoom.getDirection().get("E");
                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);   // testing purposes
                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }
                    break;
                case "S":
                    try {
                        roomName = newRoom.getDirection().get("S");

                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);    // testing purposes

                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }

                    break;
                case "W":
                    try {
                        roomName = newRoom.getDirection().get("W");

                        if(roomName.equals("room4") && !userItems.getItems().contains("Shoe Room Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }else if(roomName.equals("room6") && !userItems.getItems().contains("Soft Slippers")){
                            System.out.println("'There's someone there, I'll need to find a way to sneak through'");
                            break;
                        }else if(roomName.equals("room8") && !userItems.getItems().contains("Guard Room - Padlock Key")){
                            System.out.println("Door's locked. Need to find a key.");
                            break;
                        }

                        //System.out.println("Switching to: " + roomName);    // testing purposes

                        newRoom = new RoomData();
                        System.out.println("You are now in " + newRoom.nameOfRoom(roomName));
                        newRoom.setLongDescription(roomName);
                        newRoom.setShortDescription(roomName);
                        newRoom.roomItems(roomName);
                        newRoom.roomDirections(roomName);
                        if(!user.getRooms().contains(roomName)){
                            System.out.println(newRoom.getLongDescription());
                            user.addRoom(roomName);
                        }
                        if(roomName.equals("room8")){
                            isRunning = false;
                        }
                    }catch (NullPointerException nullExc){
                        System.out.println("Can't go in that direction");
                    }
                    break;
                case "1":
                    if(newRoom.getItems()[0] == null){
                        System.out.println("No items in here");
                    }else{
                        if(roomName.equals("room7") && !userItems.getItems().contains("Flashlight")){
                            System.out.println("'Can't see a thing, I'll need to find a way to brighten up the room'");
                        }else {
                            String item = newRoom.getItems()[0];
                            userItems.addItems(user, item);
                        }
                    }
                    break;
                case "2":
                    if(userItems.getItems().isEmpty()){
                        System.out.println("You don't have any items!");
                    }else{
                        userItems.printItems();
                    }
                    break;
                case "3":
                    System.out.println(newRoom.nameOfRoom(roomName));
                    break;
                case "4":
                    System.out.println(newRoom.getShortDescription());
                    break;
                case "5":
                    newRoom.getInfo();
                    break;
                case "6":
                    isRunning = false;
                default:
                    System.out.println("That wasn't a valid input.");
                    break;
            }

        }

            //promptEnterKey();

    }


    public static String getValidInput(String prompt, String[] validInputs){
        Scanner input = new Scanner(System.in);
        String choice;
        do{
            System.out.println(prompt);
            choice = input.next();

        }while(!isValid(validInputs, choice));
        return choice;
    }

    public static boolean isValid(String[] validInputs, String choice){
        for(String input : validInputs){
            if(input.equals(choice)){
                return true;
            }
        }
        System.out.println("Wrong input");
        return false;
    }


}

