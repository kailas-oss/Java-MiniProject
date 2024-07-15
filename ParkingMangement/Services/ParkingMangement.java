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
    public void displayAll() throws SlotNotava{
        if(List.isEmpty()){
            throw new SlotNotava("........No data's present.........");
        }
        else{
            int count = List.size();
            System.out.println(count);
            for(Vehicle veh:List){
                System.out.println(veh);
            }
        }
    }

}
