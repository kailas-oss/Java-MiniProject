package StudentManagement.test;

import java.util.*;
import StudentManagement.services.AddStud;
import StudentManagement.services.StudentMng;

public class Student {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StudentMng stdMng=new StudentMng();
    //ArrayList<> std=new ArrayList<>();
    int choice=0;
    do{
        try{
            System.out.println("Add Student details-->1");
            System.out.println("Delete Student-->2");
            System.out.println("Find  Student by first name-->3");
            System.out.println("Find Student by Registered course-->4");
            System.out.println("Count Student-->5");
            System.out.println("Delete-->6");
            System.out.println("Update Student-->7");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                List<Integer> mark=new ArrayList<>();
                System.out.println("Enter the name,roll no,mark,course:");
                String name=sc.next();
                int rollNo=sc.nextInt();
                String course=sc.next();
                for(int i=0;i<6;i++){
                    mark.add(sc.nextInt());
                }
                stdMng.AddStudent(new AddStud(name,rollNo,course,mark));
                    break;

                case 2:
                int findRollNo=sc.nextInt();
                stdMng.StudDelete(findRollNo);
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                break;
            
                default:
                System.out.println("Exit");
                    break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }while(choice!=7);
   }

}