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

    }
}
