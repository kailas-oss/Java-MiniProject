package ParkingMangement.Services;

import java.util.ArrayList;

import ParkingMangement.Exception.SlotNotava;

public class ParkingMangement {
    ArrayList<Vehicle> List;
    public ParkingMangement(){
        this.List = new ArrayList<>();
    }
    public void AddVeh(Vehicle vehicle) throws SlotNotava{
        if(List.stream().count()>1)
        throw new SlotNotava(".........Slot Not Available........");
        List.add(vehicle);
        return;
    }

}
