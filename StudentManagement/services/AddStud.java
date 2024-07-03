package StudentManagement.services;

import java.util.ArrayList;

public class AddStud {
    String name;
    int rollNo;
    String course;
    ArrayList<Integer> mark;
    public AddStud(){}
    public AddStud(String name,int rollNo,String course,ArrayList<Integer> mark){
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;
        this.mark=mark;
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+rollNo);
        System.out.println("Course:"+course);
        System.out.println("Marks: "+mark);
    }
    public  String toString(){
        return name+"\t"+rollNo+"\t"+course+"\t"+mark;
    }
}
