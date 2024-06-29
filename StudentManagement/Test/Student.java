package StudentManagement.test;
import java.util.*;
import java.util.Scanner;

import StudentManagement.services.AddStud;

public class Student {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice=0;
    do{
        try{
            System.out.println("Add Student details-->1");
            System.out.println("Find details by RollNo-->2");
            System.out.println("Find  Student by first name-->3");
            System.out.println("Find Student by Registered course-->4");
            System.out.println("Count Student-->5");
            System.out.println("Delete-->6");
            System.out.println("Update Student-->7");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                // ArrayList list=new ArrayList<>();
                // System.out.println("Enter the first name,last name,roll no,cgpa,course:");
                // String firstName=sc.nextLine();
                // String lastName=sc.nextLine();
                // int rollNo=sc.nextInt();
                // float cgpa=sc.nextFloat();
                // String course=sc.nextLine();
                // list.add(new ArrayList<>());
                    break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                break;

                case 7:
                break;
            
                default:
                    break;
            }
        }catch(Exception e){
            System.out.println();
        }
    }while(choice!=7);
   }
}