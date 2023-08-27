package com.example.snakeandladder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader  = new BufferedReader(inputStreamReader);
        System.out.print("Enter the board size : ");
        int size = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of snake : ");
        int snakeSize = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of ladder : ");
        int ladderSize = Integer.parseInt(reader.readLine());
        System.out.print("Enter number of player : ");
        int playerNumber = Integer.parseInt(reader.readLine());
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder(size, snakeSize, ladderSize,playerNumber);
        snakeAndLadder.startGame();
    }
}
