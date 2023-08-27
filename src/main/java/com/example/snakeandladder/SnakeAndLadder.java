package com.example.snakeandladder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class SnakeAndLadder {


    Deque<Player> playersQu;
    Dice dice;
    Board board;
    int size;

    public SnakeAndLadder(int size, int sizeOfSnake, int sizeOfLadder, int numberOfPlayer)
    {
        this.size = size;
        this.dice = new Dice();
       board = new Board(size, sizeOfSnake, sizeOfLadder);
        playersQu  = new ArrayDeque<>();
        for(int i = 1;i<=numberOfPlayer;i++)
        {
            playersQu.add(new Player("Player"+i,0));
        }
    }

    public void startGame()
    {
        boolean noWin = true;
        while (noWin)
        {
            Player p = playersQu.pollFirst();
            System.out.println("chance of "+p.name );
            int nextPosition = dice.rollDice();
            System.out.println("dice number "+nextPosition);
            if(p.position+nextPosition>= (this.size*this.size))
            {
                System.out.println(p.name+" win the game");
                noWin = false;

            }
            else{
                p.position =  board.getNexPosition(p.position+nextPosition);
                System.out.println("goto position "+p.position);

                playersQu.addLast(p);

            }
        }

    }

}
