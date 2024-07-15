package ParkingMangement.Test;
import java.util.Scanner;
import ParkingMangement.Services.Vehicle;
import ParkingMangement.Exception.SlotNotava;
import ParkingMangement.Services.ParkingMangement;

public class ParkingTest {
    public static void main(String[] args) {
        ParkingMangement parMng = new ParkingMangement();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            try{
                System.out.println("Add student-->1");
                System.out.println("Set visitor vehicle timeOut-->2");
                System.out.println("Count vehicles & display the Vehicles-->3");
                System.out.println("To Exit-->4");


                System.out.println("Enter you choice: ");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                    parMng.AddVeh(new Vehicle("Tn3221","kaials",629163,16,"true"));
                    System.out.println("successfully added");
                    System.out.println();
                    break;

                    case 2:
                    
                    break;

                    case 3:
                    parMng.displayAll();
                    break;

                    case 4:
                    System.out.println("Exiting.....");
                    default:

                    System.out.println("Invalid choice! please try again");
                }
    
                
    
            }
            catch(SlotNotava e){
                System.out.println(e.getMessage());
            }
            catch(Exception e ){
                System.out.println(e.getMessage());
            }
        }
        while (choice<=4);
    }
}
