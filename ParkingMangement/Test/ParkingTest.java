package ParkingMangement.Test;
import java.util.Scanner;
import ParkingMangement.Services.Vehicle;
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
                System.out.println("Count vehicles-->3");
                System.out.println("To display all the vehicles-->4");


                System.out.println("Enter you choice: ");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                    parMng.AddVeh(new Vehicle("Tn3221","kaials",629163,16,"true"));
                    System.out.println();
                    break;

                    case 2:

                }
    
                
    
            }catch(Exception e ){
                System.out.println(e);
            }
        }
        while (choice<=4);
    }
}


/*parMng.AddVeh(new Vehicle("Tn2001","Reshmi",629103,13,"True" ));
                    parMng.AddVeh(new Vehicle("Tn8722","Johin",629003,06,"True" ));
                    parMng.AddVeh(new Vehicle("Tn4311","Nabish",726282,98,"True" ));
                    parMng.AddVeh(new Vehicle("Tn7522","Ashick",928202,00,"True" )); */