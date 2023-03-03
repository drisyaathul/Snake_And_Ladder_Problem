package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int singlePlayerPosition = 0;
        System.out.println("Single Player at Start Position is Zero");
        System.out.println("GAME STARTS :-");

        Random random = new Random();
        int die = random.nextInt(6)+1;
        System.out.println("Player1 rolls the die and the random die is  : "+die);

        int option = random.nextInt(3)+1;
        switch (option){
            case 1:
                System.out.println("No Play");
                System.out.println("The Player stays in the same position: "+(singlePlayerPosition));
                break;
            case 2:
                System.out.println("Ladder");
                System.out.println("The Player moves ahead : "+(singlePlayerPosition+die));
                break;
            case 3:
                System.out.println("Snake");
                System.out.println("The Player moves behind : "+(singlePlayerPosition-die));
        }
    }
}
