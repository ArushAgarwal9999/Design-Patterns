package com.example.disignpatterns.decoratordesignpattern.topings;

import com.example.disignpatterns.decoratordesignpattern.pizaa.BasePizaa;

public class ExtraTopings extends BaseTopings{
    BasePizaa pizaa;

    public ExtraTopings(BasePizaa pizaa) {
        this.pizaa = pizaa;
    }

    @Override
    public int getCost() {
        return this.pizaa.getCost()+30;
    }
}
