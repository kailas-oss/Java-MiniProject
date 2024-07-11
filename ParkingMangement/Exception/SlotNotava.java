package ParkingMangement.Exception;

public class SlotNotava extends Exception {
    String s;
    public SlotNotava(){
        super();
    }
    public SlotNotava(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
}
