package StudentManagement.test;

import java.util.*;
import StudentManagement.services.AddStud;
import StudentManagement.services.StudentMng;

public class Student {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StudentMng stdMng=new StudentMng();
    int choice=0;
    do{
        try{
            System.out.println("Add Student details-->1");
            System.out.println("Delete Student-->2");
            System.out.println("List the student details-->3");
            System.out.println("Update student details-->4");
            System.out.println("Fidn topper-->5");
            System.out.println("Delete-->6");
            System.out.println("Update Student-->7");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                List<Integer> mark=new ArrayList<>();
                System.out.println("Enter the name,roll no,course:,marks");
                String name=sc.next();
                int rollNo=sc.nextInt();
                String course=sc.next();
                for(int i=0;i<4;i++){
                    mark.add(sc.nextInt());
                }
                stdMng.AddStudent(new AddStud(name,rollNo,course,mark));
                    break;

                case 2:
                int findRollNo=sc.nextInt();
                stdMng.StudDelete(findRollNo);
                break;

                case 3:
                stdMng.StudDetails();
                break;

                case 4:
                System.out.println("Enter the Rollno to update:");
                int RollNo=sc.nextInt();
                ArrayList<Integer> Upmark =new ArrayList<>();
                System.out.println("Enter the name,course,mark:");
                String Upname=sc.next();
                String Upcourse=sc.next();
                for(int i=0;i<4;i++){
                    Upmark.add(sc.nextInt());
                }
                stdMng.Update(RollNo,new AddStud(Upname,RollNo,Upcourse,Upmark));
                break;

                case 5:
                System.out.println(stdMng.findTopper());
                break;

                case 6:
                System.out.println("Exit");
                break;
            
                default:
                System.out.println("Wrong choice");
                    break;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }while(choice!=7);
   }

}