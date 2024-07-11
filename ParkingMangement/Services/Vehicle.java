package ParkingMangement.Services;

public class Vehicle {
    String vehicleNo;
    String name;
    int mobileNo;
    int flatNo;
    String flag;

    public Vehicle(String vehicleNo, String name, int mobileNo, int flatNo, String flag) {
        this.vehicleNo = vehicleNo;
        this.name = name;
        this.mobileNo = mobileNo;
        this.flatNo = flatNo;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Vehicle No: " + vehicleNo + "\n" +
               "Name: " + name + "\n" +
               "Mobile No: " + mobileNo + "\n" +
               "Flat No: " + flatNo + "\n" +
               "Status: " + flag;
    }
}
