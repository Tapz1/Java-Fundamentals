package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.io.*;
import java.util.ArrayList;
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


        String[] validInputs = {"1", "2", "3"};

        String userName = "Chris";  // test

        Items userItems = new Items();

        Character user = new Character(userName, userItems);

        boolean isRunning = true;
        String roomName = "room3";
        RoomObjects roomObj = new RoomObjects();
        RoomData newRoom = new RoomData();

        roomObj.roomName(roomName);
        roomObj.longDescription(roomName);
        roomObj.shortDescription(roomName);
        roomObj.roomItems(roomName);
        roomObj.roomDirections(roomName);

        while(isRunning){
            System.out.println("Game Start");
            System.out.println("You are in " + roomObj.roomName(roomName));
            Scanner in = new Scanner(System.in);
            System.out.println("Choose an option: ");
            String choice = in.next();
            switch (choice){
                case "N":
                    roomName = newRoom.getDirection("N");
                    System.out.println("Switching to: " + roomName);
                    newRoom = new RoomData();
                    roomObj.roomName(roomName);
                    roomObj.longDescription(roomName);
                    roomObj.shortDescription(roomName);
                    roomObj.roomItems(roomName);
                    roomObj.roomDirections(roomName);
                    break;
                case "exit":
                    isRunning = false;
                default:
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

