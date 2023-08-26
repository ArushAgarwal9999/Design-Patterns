package com.example.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class Board {
    Icons[][] board;
    public Board()
    {
        board = new Icons[3][3];
    }
    public boolean canDoOperation(int row, int col)
    {
        if(board[row][col] == null)
                return true;
        return false;
    }
    public void doOperation(int row, int col, Icons icon)
    {
        if(board[row][col] != null)
            throw new RuntimeException("Invalid Operation ");
        board[row][col] = icon;


    }

    public IsAnyWin isAnyWin()
    {
        HashMap<Icons, Integer> map1 = new HashMap<>();
        HashMap<Icons, Integer> map2 = new HashMap<>();
        for(int i = 0;i<board.length;i++)
        {
            if(board[0][i] != null)
                map1.put(board[0][i],map1.getOrDefault(board[0][i],0)+1);

            if(board[board.length-1][i] != null)
                map2.put(board[board.length-1][i],map2.getOrDefault(board[board.length-1][i],0)+1);
        }
        for(Map.Entry<Icons, Integer> entry: map1.entrySet())
        {
            if(entry.getValue() == 3)
            {
                return new IsAnyWin(true, entry.getKey());
            }
        }
        for(Map.Entry<Icons, Integer> entry: map2.entrySet())
        {
            if(entry.getValue() == 3)
            {
                return new IsAnyWin(true, entry.getKey());
            }
        }
        map1.clear();
        map2.clear();
        for(int i = 0;i<board.length;i++)
        {
            if(board[i][0] != null)
                map1.put(board[i][0],map1.getOrDefault(board[i][0],0)+1);

            if(board[i][board.length-1] != null)
                map2.put(board[i][board.length-1],map2.getOrDefault(board[i][board.length-1],0)+1);
        }
        for(Map.Entry<Icons, Integer> entry: map1.entrySet())
        {
            if(entry.getValue() == 3)
            {
                return new IsAnyWin(true, entry.getKey());
            }
        }
        for(Map.Entry<Icons, Integer> entry: map2.entrySet())
        {
            if(entry.getValue() == 3)
            {
                return new IsAnyWin(true, entry.getKey());
            }
        }
        return new IsAnyWin(false, null);
    }
    public boolean isTie()
    {
        for(Icons[]a: board)
        {
            for(Icons i:a)
                if( i == null)
                    return false;
        }
        return true;
    }
    public String printBoard()
    {
        StringBuffer result = new StringBuffer();
        for(Icons[] a: board)
        {
            int index = 0;
            for(Icons i: a)
            {
                if(i != null)
                {
                    result.append(i);
                }
                else{
                    result.append(" ");
                }

                if(index <2)
                    result.append("|");
                index++;

            }
            result.append('\n');
        }
        return result.toString();
    }
}
