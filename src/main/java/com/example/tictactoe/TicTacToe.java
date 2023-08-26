package com.example.tictactoe;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TicTacToe {

    Deque<Player> qu;
    Board board;
    public TicTacToe()
    {
        qu = new ArrayDeque<>();
        initializePlayer();
        board = new Board();
    }
    public void initializePlayer()
    {
        qu.add(new Player(Icons.X));
        qu.add(new Player(Icons.O));
    }

    public void startGame() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader  = new BufferedReader(inputStreamReader);


        boolean isGameOver = false;
        IsAnyWin isAnyWin= null;
        boolean isTie = false;
        while(!isGameOver)
        {
            System.out.print("Enter row number: ");
            int row = Integer.parseInt(reader.readLine());
            System.out.print("Enter col number: ");
            int col = Integer.parseInt(reader.readLine());

            Player player = qu.pollFirst();
           if(board.canDoOperation(row, col))
           {
               System.out.println("player icon -->>"+player.getMyIcon());
               board.doOperation(row, col, player.getMyIcon());
               qu.addLast(player);
               isAnyWin = board.isAnyWin();
               isTie = board.isTie();
               if(isAnyWin.isAnyWin() || isTie)
               {
                   isGameOver = true;
               }
           }
           else {
               qu.addFirst(player);
               System.out.println("Enter row Col is wrong");
           }
            System.out.println("Board:");
            System.out.println(board.printBoard());
        }
        if(isTie)
        {
            System.out.println("Game TIe");
        }
        if(isAnyWin != null && isAnyWin.isAnyWin())
        {
            System.out.println("Player "+ isAnyWin.getIcons() +" is win");
        }
    }
}

