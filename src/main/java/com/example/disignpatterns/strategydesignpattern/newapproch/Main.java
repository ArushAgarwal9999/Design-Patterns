package com.example.disignpatterns.strategydesignpattern.newapproch;

import com.example.disignpatterns.strategydesignpattern.newapproch.run.NormalVehicleRun;
import com.example.disignpatterns.strategydesignpattern.newapproch.run.SportsVehicleRun;

public class Main {

    public static void main(String[] args)
    {
        Vehicle vehicle1=  new SportsVehicle(new SportsVehicleRun());
        Vehicle vehicle2=  new PassengerVehicle(new NormalVehicleRun());
        Vehicle vehicle3=  new OffRoadSportsVehicle(new SportsVehicleRun());
        vehicle1.run.run();
        vehicle2.run.run();
        vehicle3.run.run();
    }

}
