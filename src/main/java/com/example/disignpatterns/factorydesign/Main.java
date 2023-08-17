package com.example.disignpatterns.factorydesign;

import com.example.disignpatterns.factorydesign.factory.Factory;
import com.example.disignpatterns.factorydesign.shape.Shape;

public class Main {
    public static void main(String[] args)
    {
        Factory f = new Factory();
        Shape s = f.getShape("circle");
        s.draw();
    }
}
