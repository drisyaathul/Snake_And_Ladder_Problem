package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadderSimulator {

    static final int winningPosition = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");

        int singlePlayerPosition = 0;
        boolean position = true;
        System.out.println("Single Player at Start Position is Zero");
        System.out.println("GAME STARTS :-");

        while (singlePlayerPosition != winningPosition) {

            if (position == true) {
                System.out.println("The Player1 current position is "+singlePlayerPosition);
                Random random = new Random();
                int die = random.nextInt(6) + 1;
                System.out.println("Player1 rolls the die and the random die is  : " +die);

                int option = random.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("No Play");
                        System.out.println("The Player stays in the same position: " +(singlePlayerPosition));
                        break;
                    case 2:

                        System.out.println("Ladder");
                        System.out.println("The Player moves ahead to : " +(singlePlayerPosition+die));
                        singlePlayerPosition = singlePlayerPosition + die;
                        break;
                    case 3:

                        System.out.println("Snake");
                        System.out.println("The Player moves behind to : " +(singlePlayerPosition-die));
                        singlePlayerPosition = singlePlayerPosition - die;
                        break;
                }
                System.out.println();
                if (singlePlayerPosition<0) {
                    singlePlayerPosition = 0;
                } else if (singlePlayerPosition>winningPosition) {
                    singlePlayerPosition = die;
                }
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("*** The Player gets the Exact WINNING Position of 100 ***");

    }
}