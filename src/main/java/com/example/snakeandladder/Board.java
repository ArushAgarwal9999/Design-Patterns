package com.example.snakeandladder;

import java.util.Random;

public class Board {
    private final int size;
    private final int sizeOfLadder;
    private final int sizeOfSnake;
    Cell[][] board;
    public Board(int size, int sizeOfSnake, int sizeOfLadder)
    {
        this.size = size;
        this.sizeOfLadder  = sizeOfLadder;
        this.sizeOfSnake = sizeOfSnake;
        board=  new Cell[this.size][this.size];
        initializeSnakes();
        initializeLadder();
    }
    public void initializeSnakes()
    {
        int curSize = this.sizeOfSnake;
        while(curSize>0)
        {
            Random r= new Random();
            int index = r.nextInt((this.size*this.size)-1)+1;
            int row = getRow(index);
            int col = getCol(index);
            if(board[row][col] == null)
            {
                int gotoIndex =Integer.MAX_VALUE;
                while(gotoIndex> index)
                {
                    gotoIndex = r.nextInt((this.size*this.size)-1)+1;
                }
               board[row][col] = new Cell(gotoIndex);
                curSize--;
            }
        }
    }
    public int getNexPosition(int position)
    {
        int row = getRow(position);
        int col = getCol(position);
        if(board[row][col] ==null || board[row][col].gotoPosition == position)
                return position;
        if(board[row][col].gotoPosition < position)
            System.out.println("found snake and goto this "+board[row][col].gotoPosition+" position");
        else
            System.out.println("found ladder and goto this "+board[row][col].gotoPosition+" position");
        return getNexPosition(board[row][col].gotoPosition);

    }

    public void initializeLadder()
    {
        int curSize = this.sizeOfLadder;
        while(curSize>0)
        {
            Random r= new Random();
            int index = r.nextInt((this.size*this.size)-1)+1;
            int row = getRow(index);
            int col = getCol(index);
            if(board[row][col] == null)
            {
                int gotoIndex =Integer.MIN_VALUE;
                while(gotoIndex<= index)
                {
                    gotoIndex = r.nextInt((this.size*this.size)-1)+1;
                }
                board[row][col] = new Cell(gotoIndex);
                curSize--;
            }
        }
    }
    public int getRow(int position)
    {
        return position/this.size;
    }
    public int getCol(int position)
    {
        return position%this.size;
    }
}
