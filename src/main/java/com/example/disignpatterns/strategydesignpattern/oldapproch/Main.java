package com.example.disignpatterns.strategydesignpattern.oldapproch;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new PassengerVehicle();
        Vehicle vehicle2 = new OffRoadSportsVehicle();
        Vehicle vehicle3 = new SportsVehicle();
        vehicle1.run();
        vehicle2.run();
        vehicle3.run();
    }
}
/*
    hamna ak vechile class banay jis ma run method ha ab us class ka then child class banay ab ak class ka liya parent method thik ha
    but do child class ka liya parent method ke implementation change kar ne pada ge aur dono child class ma same implemention likne pad
    rahi ha jo code dublicate ha

    es issue ko resolve kar ta ha Strategy design pattern
 */
