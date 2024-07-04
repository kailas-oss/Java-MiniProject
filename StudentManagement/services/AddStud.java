package StudentManagement.services;

import java.util.ArrayList;
import java.util.List;

public class AddStud {
    String name;
    int rollNo;
    String course;
    List<Integer> mark;
    public AddStud(){}
    public AddStud(String name,int rollNo,String course,List<Integer> mark){
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;
        this.mark=mark;
    }
    public String toString() {
        return "Name: " + name + "\n" +
               "RollNo: " + rollNo + "\n" +
               "Course: " + course + "\n" +
               "Marks: " + mark + "\n";
    }
    public int getRollNo() {
        return rollNo;
    }
}
