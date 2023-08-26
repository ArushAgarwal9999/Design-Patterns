package com.example.tictactoe;

public class IsAnyWin {
    private  boolean isAnyWin;
    private Icons icons;

    public IsAnyWin(boolean isAnyWin, Icons icons) {
        this.isAnyWin = isAnyWin;
        this.icons = icons;
    }

    public boolean isAnyWin() {
        return isAnyWin;
    }

    public void setAnyWin(boolean anyWin) {
        isAnyWin = anyWin;
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }
}
