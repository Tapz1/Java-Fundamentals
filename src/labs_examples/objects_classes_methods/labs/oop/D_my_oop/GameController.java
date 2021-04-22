package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


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
        Scanner input = new Scanner(System.in);
        String choice;

        Skills userSkills = new Skills();
        //UserItems newItems = new UserItems();


        String playAgain;
        do{
            System.out.println("RADIO: Hello?");
            System.out.println("*you answer the radio*");
            System.out.println("RADIO: Oh thank God. What's your name? ");
            String userName = input.next();
            Character user = new Character(userName, userSkills);

            System.out.println("RADIO: Awesome, great to meet you, " + userName + ".");

            promptEnterKey();

            System.out.println("RADIO: Looks like your plane crashed but we're able to rescue you. You just need to find a flare gun in the pilot's cabin and get to the nearest shore. We have no data on the island you're on so be careful of any predators or locals. Good luck.");
            promptEnterKey();

            System.out.println("You look around and find some items. ");
            UserItems userItems = new UserItems();
            userItems.myItems.add("hatchet");
            userItems.myItems.add("backpack");
            userItems.myItems.add("flare gun");
            promptEnterKey();

            userItems.displayItems(user);
            promptEnterKey();
            int increase = 15;
            user.skills.attackIncrease(increase);
            promptEnterKey();

            System.out.println("What would you like to do next, 1 or 2? \n1. Look around the plane some more \n2. Exit the plane");
            choice = input.next();


            while((!choice.equals("1")) && (!choice.equals("2"))){
                System.out.println("What would you like to do next, 1 or 2? \n1. Look around the plane some more \n2. Exit the plane");
                choice = input.next();
            }
            if(choice.equals("1")){
                actOneChoiceOne(user, userSkills);
            }else{
                System.out.println("You walk out.");
            }

            System.out.println("As soon as you walk out of the plan, you are attacked by a wild boar ");
            fightSequence(user, userSkills, "boar", 8);


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

