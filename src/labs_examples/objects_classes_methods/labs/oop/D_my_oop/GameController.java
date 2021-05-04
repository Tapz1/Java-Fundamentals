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
        //letsPlay();
        String userName = "Chris";

        Items userItems = new Items();

        Character user = new Character(userName, userItems);
        //RoomObjects room = new RoomObjects();



        /*room.setRoom1(user);
        //room.getRoom1();
        System.out.println("Current Location: " +user.getLocation());
        System.out.println(room.getRoom1().getLongDescription());

        room.setRoom2(user);
        System.out.println("New Location: " +user.getLocation());

        String var = room.getRoom2().getDirection("W");
        user.setLocation(var);
        System.out.println("New New Location: " +user.getLocation());*/
    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }



    public static void letsPlay(){

        //String filePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";

        String str;


/*
        try (BufferedReader buffIn = new BufferedReader(new FileReader(filePath)); BufferedWriter buffOut = new BufferedWriter(new FileWriter(writePath))) {
            int n;

            do{
                str = buffIn.readLine();
                buffOut.write(str);
                System.out.print(str);
            }while(buffIn.read() != -1);
        } catch (IOException exc) {
            System.out.println("Error occurred: " + exc.getMessage());
        }
*/

        Scanner input = new Scanner(System.in);
        String choice;

        //Skills userSkills = new Skills();



        String[] validInputs = {"1", "2", "3"};

        boolean isRunning = true;
        do{
            System.out.println("Enter your name: ");
            String userName = input.next();

            Items userItems = new Items();
            //ArrayList<String> itemList = userItems.getItems();

            Character user = new Character(userName, userItems);
            //RoomObjects room = new RoomObjects();
            //room.room1.roomObjects.getRoom1();
            ArrayList<String> roomList = user.getRooms();

            // creates saved game data
            String writePath = "files\\"+userName+"_gameData.txt";
            promptEnterKey();

            String userInput = input.next();
            switch (userInput){
                case "N":

            }




            promptEnterKey();


        }while(isRunning);
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

