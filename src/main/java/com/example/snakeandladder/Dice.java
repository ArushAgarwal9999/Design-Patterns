package com.example.snakeandladder;

import java.util.Random;

public class Dice {
    public int rollDice()
    {
        Random r= new Random();
        return r.nextInt(7-1)+1;
    }
}
