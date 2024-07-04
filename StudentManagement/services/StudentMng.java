package StudentManagement.services;

import java.util.*;
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

    public void StudDelete(int rollNo){
        List<AddStud> s = list.stream().filter(i -> i.getRollNo() == rollNo).limit(1).collect(Collectors.toList());
        
    }
}
