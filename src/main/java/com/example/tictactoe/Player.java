package com.example.tictactoe;

public class Player {
    public Player(Icons myIcon) {
        this.myIcon = myIcon;
    }

    public Icons getMyIcon() {
        return myIcon;
    }

    public void setMyIcon(Icons myIcon) {
        this.myIcon = myIcon;
    }

    Icons myIcon ;
}
