package StudentManagement.services;

import java.util.*;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

import StudentManagement.StudentExcep.StudEx;

public class StudentMng implements StudentInterface {
    List<AddStud> list;

    public StudentMng() {
        list = new ArrayList<>();
    }

    @Override
    public boolean AddStudent(AddStud s) {
        if (list.size() > 1) { 
            return false;
        }
        list.add(s);
        return true;
    }

    public void StudDelete(int rollNo) throws Exception {
        List<AddStud> s = list.stream().filter(i -> i.getRollNo() == rollNo).limit(1).collect(Collectors.toList());
        if(s.isEmpty())
        throw new StudEx("DOES NOT EXIST "+rollNo);
        list.remove(s);
    }
    public void StudDetails(){
        for(AddStud li:list){
            System.out.println(li);
        }
    }

    @Override
    public void Update(int rollNo,AddStud Upstudent) throws Exception {
        List<AddStud> s = list.stream().filter(i -> i.getRollNo() == rollNo).limit(1).collect(Collectors.toList());
        System.out.println(s);
        if(s.isEmpty())
        throw new StudEx("Student doesn't exist at this rollNo! ");
        Collections.replaceAll(list, s.get(0), Upstudent);
    }
    public void findTopper() throws Exception{
        if (list.isEmpty()) {
            throw new StudEx("Student list is empty!");
        }
        AddStud topper = list.stream()
                .max(Comparator.comparingInt(s -> s.getMark().stream().mapToInt(x -> x).sum()))
                .orElseThrow(() -> new StudEx("Could not find the topper"));
        System.out.println("Topper: " + topper);
    }
}
/*String name;
    int rollNo;
    String course;
    List<Integer> mark; */
