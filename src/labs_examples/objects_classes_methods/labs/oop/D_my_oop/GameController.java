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

        String filePath = "C:\\Users\\chris\\Documents\\Coding\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";

        String str;


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

        Scanner input = new Scanner(System.in);
        String choice;

        //Skills userSkills = new Skills();




        String playAgain;
        do{

            RoomDescriptions newRoom = new RoomDescriptions();
            Items userItems = new Items();
            ArrayList<String> itemList = userItems.getItems();

            String[] inputs = {"1", "2"};

            System.out.println("Enter your name: ");
            String userName = input.next();
            Character user = new Character(userName, userItems, Location.ROOM1);
            ArrayList<String> roomList = user.getRooms();

            String writePath = "input_output\\files\\"+userName+"_gameData.txt";
            promptEnterKey();
            Location room = Location.ROOM1;

            if(roomList.contains("room1")){
                System.out.println(newRoom.room1Short);
            }else{
                // adds new room to list and prints out long description
                user.addRoom("room1");
                System.out.println(newRoom.room1Long);
            }
            promptEnterKey();

            /* Room 1 ******/
            choice = getValidInput("1) Head to the door on your left \n2) Inspect the bookshelf to your right",inputs);
            if(choice.equals("2")){
                System.out.println("You go to inspect the bookshelf and notice a book that's out of place," +
                        " sticking out slightly. You push in the book and the whole bookshelf moves," +
                        " exposing a doorway.");
                promptEnterKey();

                if(roomList.contains("room2")){
                    user.location = Location.;
                    System.out.println(newRoom.room2Short);
                }else{
                    // adds new room to list and prints out long description
                    user.addRoom("room2");
                    System.out.println(newRoom.room2Long);
                    userItems.addItems("Room 3 Key");
                    promptEnterKey();
                    System.out.println("You return back to the first room");
                    room = Location.ROOM1;
                }

            }else{
                /* goes to third room */
                //room = Location.ROOM3;
                System.out.println("You open the door to your left, going East");
                promptEnterKey();
                if(roomList.contains("room3")){
                    System.out.println(newRoom.room3Short);
                }else{
                    // adds new room to list and prints out long description
                    user.addRoom("room3");
                    System.out.println(newRoom.room3Long);
                }
            }

            if(room == Location.ROOM1){
                System.out.println(newRoom.room1Short);
                choice = getValidInput("1) Head to the door on your left \n2) Inspect the bookshelf to your right",inputs);
            }

            promptEnterKey();

            /* Room 2 ******/
            choice = getValidInput("1) Search the room\n2) Try the door on your right",inputs);

            if(choice.equals("1")){
                System.out.println("Upon searching the room, you find a pair of super soft boot-like slippers that" +
                        " don't make any noise when you walk.");
                promptEnterKey();
                System.out.println("\"This could be useful\"");
                System.out.println("You put them on.");
                promptEnterKey();
                userItems.addItems("slippers");

            }else{
                System.out.println("You try the door to your right, going North");
                promptEnterKey();
                if(itemList.contains("Room 3 Key")){
                    System.out.println(newRoom.room3Short);
                }else{
                    // adds new room to list and prints out long description
                    user.addRoom("room3");
                    System.out.println(newRoom.room3Long);
                }
            }

            promptEnterKey();

            /* Room 3 ******/
            choice = getValidInput("1) Search the room\n2) Try the door on your right",inputs);

            if(choice.equals("1")){
                System.out.println("You go to inspect the bookshelf and notice a book that's out of place, " +
                        "sticking out slightly. You push in the book and the whole bookshelf moves, exposing a doorway.");
                promptEnterKey();

                if(roomList.contains("room3")){
                    System.out.println(newRoom.room2Short);
                }else{
                    // adds new room to list and prints out long description
                    user.addRoom("room2");
                    System.out.println(newRoom.room2Long);
                }

            }else{
                System.out.println("You open the door to your left, going East");
                promptEnterKey();
                if(roomList.contains("room3")){
                    System.out.println(newRoom.room3Short);
                }else{
                    // adds new room to list and prints out long description
                    user.addRoom("room3");
                    System.out.println(newRoom.room3Long);
                }
            }




            System.out.println("Would you like to play again? Type 'no' to exit");
            playAgain = input.next();
        }while(!playAgain.equals("no"));
    }

    public static void actOneChoiceOne(Character user, Skills skills){
        System.out.println("Upon searching the room, you find a healthkit which increases your health permanently.");
        promptEnterKey();
        int increase = 20;
        user.skills.healthIncrease(increase);

        System.out.println("Your health increased by " + increase + "! Your health is now at " + skills.health);
        promptEnterKey();
    }

/*    public static String returnDescription(Character user, String room){

    }*/

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
    public static void fightSequence(Character user, Skills skills, String enemy, int damage){
        String choice;
        do{
            System.out.println(enemy + " charged at you.");
            String[] inputs = {"1", "2"};
            choice = getValidInput("What would you like to do? \n1. Attack \n2.Dodge",inputs);


            if(choice.equals("1")){
                user.skills.healthDecrease(8);
                System.out.println("You get hurt by " + enemy);
                System.out.println("But you attack right back and kill it dealing " + user.skills.attack + " damage to it.");
                promptEnterKey();

            }else{
                System.out.println("You dodge");
                System.out.println("But then you attack right after and kill it dealing " + user.skills.attack + " damage to it.");
                promptEnterKey();
            }



        }while(true);
    }


}

