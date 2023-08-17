package com.example.disignpatterns.factorydesign.factory;

import com.example.disignpatterns.factorydesign.shape.Circle;
import com.example.disignpatterns.factorydesign.shape.Rectangle;
import com.example.disignpatterns.factorydesign.shape.Shape;

public class Factory {

    public Shape getShape(String shape)
    {
        if(shape.equals("circle"))
            return new Circle();
        return new Rectangle();
    }
}
