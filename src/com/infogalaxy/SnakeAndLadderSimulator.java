package com.infogalaxy;

import java.util.Random;

public class SnakeAndLadderSimulator {
    //UC-1 Single Player at Start Position 0
    public void playerPosition(){
        int position = 0;
        System.out.println("Player Position : "+position);
    }
    //UC-2 Use (random) To Get the Number Between 1 To 6
    public void rollsDie(){
        Random random = new Random();
        int die = (int) ((Math.random()*(6-1))+1);
        System.out.println("Die Number : "+die);
    }

    public static void main(String[] args) {
        SnakeAndLadderSimulator snake = new SnakeAndLadderSimulator();
        snake.playerPosition();
        snake.rollsDie();
    }

}
