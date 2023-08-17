package com.example.disignpatterns.decoratordesignpattern;

import com.example.disignpatterns.decoratordesignpattern.pizaa.BasePizaa;
import com.example.disignpatterns.decoratordesignpattern.pizaa.FarmHousePizaa;
import com.example.disignpatterns.decoratordesignpattern.topings.ExtarCheseTopings;

public class Main {
    public static void main(String[] args)
    {
        BasePizaa pizaa = new ExtarCheseTopings(new FarmHousePizaa());
        System.out.println(pizaa.getCost());
    }
}
