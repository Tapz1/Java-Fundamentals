package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackJack();

/*
        Deck myDeck = new Deck();
        for(Card card : myDeck.deckCards){
            System.out.println(card);
        }
*/


    }

    public static void playBlackJack() {
        Scanner input = new Scanner(System.in);

        System.out.println("Player, what is your name?");
        String playerName = input.next();
        System.out.println("How much money do you want to place in the pot?");
        int playerPot = input.nextInt();
        System.out.println("How much does the computer put in?");
        int compPot = input.nextInt();


        // loop of the game
        do {
            /* setting bets and initial dealing */

            Deck newDeck = new Deck();

            Hand playersHand = new Hand();
            Player player = new Player(playerName, playersHand, playerPot);

            Hand compHand = new Hand();
            Player compPlayer = new Player("Computer", compHand, compPot);

            System.out.println("Before I deal, how much of your $" + playerPot + " are you going to bet, " + playerName + "?");
            int playerBet = input.nextInt();
            if (playerBet > playerPot) {
                System.out.println("That's more than you have! Try again.");
                playerBet = input.nextInt();
            }

            int compBet;
            if (compPot < 10) {
                compBet = compPot;
            } else {
                compBet = (int) (compPot * .50);
            }
            System.out.println("The computer is going to bet $" + compBet + " of its pot value of: " + compPot);
            newDeck.deal(player);
            newDeck.deal(player);
            newDeck.deal(compPlayer);
            newDeck.deal(compPlayer);

            // gets hand totals
            playersHand.scoreHand();
            compHand.scoreHand();

            System.out.println(playerName + " has: " + player.hand);
            System.out.println("The computer has: " + compPlayer.hand);

            do {
                /* continued dealing and game conclusion */

                System.out.println(playerName + " do you want another card? (yes/no)");
                String choice = input.next();

                if ((choice.equals("no") && !compPlayer.computerAI()) || (playersHand.greaterThanTwentyOne(playersHand.handValue)
                        && compHand.greaterThanTwentyOne(compHand.handValue))) {

                    //int[] bothHands = {playersHand.handValue, compHand.scoreHand()};
                    int lowestHand = Math.min(playersHand.handValue, compHand.handValue);

                    // these ifs check first win scenario when both skip their turn
                    if (playersHand.handValue == compHand.handValue) {
                        System.out.println("It's a tie!");
                    } else if ((playersHand.handValue <= 21 && playersHand.handValue > compHand.handValue) ||
                            (playersHand.handValue <= 21 && compHand.greaterThanTwentyOne(compHand.handValue))) {
                        System.out.println(playerName + " won!");
                        playerPot += compBet;
                        compPot -= compBet;
                    } else if ((compHand.handValue <= 21 && compHand.handValue > playersHand.handValue) ||
                            (compHand.handValue <= 21 && playersHand.greaterThanTwentyOne(playersHand.handValue))) {
                        System.out.println("The computer has won!");
                        compPot += playerBet;
                        playerPot -= playerBet;
                    }
                    // this if checks for second win scenario
                    if (playersHand.greaterThanTwentyOne(playersHand.handValue) &&
                            compHand.greaterThanTwentyOne(compHand.handValue)) {
                        if (lowestHand == playersHand.handValue) {
                            System.out.println("Congrats, " + playerName + ", you've won with the lesser hand!");
                            playerPot += compBet;
                            compPot -= compBet;
                        } else {
                            System.out.println("The computer has won!");
                            compPot += playerBet;
                            playerPot -= playerBet;
                        }
                    }
                    System.out.println(playerName + " has now a total of $" + playerPot);
                    System.out.println("The computer now has a total of $" + compPot);
                    break;
                }
                // checks choices of the human player
                else if (choice.equals("no") || choice.equals("No") || choice.equals("NO")) {
                    System.out.println(playerName + " skipped their turn..");
                } else if (choice.equals("yes") || choice.equals("Yes") || choice.equals("YES")) {
                    newDeck.deal(player);
                }

                if (compPlayer.computerAI()) {
                    // checks if comp is going to draw again
                    newDeck.deal(compPlayer);
                } else {
                    System.out.println("The computer skipped their turn..");
                }

                playersHand.scoreHand();
                compHand.scoreHand();


                System.out.println(playerName + " has: " + player.hand);
                System.out.println("The computer has: " + compPlayer.hand);

                if (playersHand.handValue == 21) {
                    System.out.println("Congrats, " + playerName + ", you hit blackjack!");
                    playerPot += compBet;
                    compPot -= compBet;
                    System.out.println(playerName + " has now a total of $" + playerPot);
                    System.out.println("The computer now has a total of $" + compPot);
                    break;
                } else if (compHand.scoreHand() == 21) {
                    System.out.println("The computer hit blackjack!");
                    compPot += playerBet;
                    playerPot -= playerBet;
                    System.out.println(playerName + " has now a total of $" + playerPot);
                    System.out.println("The computer now has a total of $" + compPot);
                    break;
                }
            } while (true);
        } while (playerPot > 0 || compPot > 0);

        if (playerPot == 0) {
            System.out.println("Great game, but " + playerName + " ran out of money! T_T");
        } else if (compPot == 0) {
            System.out.println("Great game, but the computer ran out of money!");
        }
    }


}


