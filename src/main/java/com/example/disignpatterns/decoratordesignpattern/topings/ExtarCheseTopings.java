package com.example.disignpatterns.decoratordesignpattern.topings;

import com.example.disignpatterns.decoratordesignpattern.pizaa.BasePizaa;

public class ExtarCheseTopings extends BaseTopings {
    BasePizaa pizaa;

    public ExtarCheseTopings(BasePizaa pizaa) {
        this.pizaa = pizaa;
    }

    @Override
    public int getCost() {
        return this.pizaa.getCost()+20;
    }
}
