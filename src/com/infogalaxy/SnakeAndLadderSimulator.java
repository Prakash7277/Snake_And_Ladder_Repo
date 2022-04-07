package com.infogalaxy;

import java.util.Random;

public class SnakeAndLadderSimulator {

    //position of player
    int position = 0;
    //Define Constant for Options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;

    //Showing the player current position
    public void showPosition() {
        System.out.println("position : " + position);
    }

    //Rolling the die to get Position
    public void rollsDie() {
        while (position!=100) {
            System.out.println("************************************");
            Random random = new Random();
            int dieNo = (int) ((Math.random() * (7 - 1)) + 1);
            System.out.println("Die Number : " + dieNo);

            // checking for option to play
            int option = (int) ((Math.random() * (4 - 1)) + 1);
            System.out.println("Position No : " + option);
            switch (option) {
                case NO_PLAY:
                    System.out.println("No play Arrived. Stay on same Position");
                    break;
                        case LADDER:
                            System.out.println("HURRAY !!! you got ladder.");
                            position = position + dieNo;
                            if (position > 100) {
                                System.out.println("Player Position is Out of Board.");
                                position = position - dieNo;
                            }
                            break;
                        case SNAKE:
                            position = position + dieNo;
                            if (position <= 100) {
                                System.out.println("OOPS  !!! you got Snake. ");
                                position = position - dieNo - dieNo;
                                if (position < 0) {
                                    position = 0;
                                    break;
                                }
                            } else {
                                System.out.println("Player Position is Out of Board.");
                                position = position - dieNo;
                            }
                            break;

            }
            showPosition();
        }
    }

    public static void main(String[] args) {
        // Creating Player 1 object
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        // Showing Player1 Position
        player1.showPosition();
        //Rolling the die
        player1.rollsDie();
        player1.showPosition();
    }

}