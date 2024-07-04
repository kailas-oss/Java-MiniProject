package StudentManagement.services;

import StudentManagement.StudentExcep.StudEx;

//import StudentManagement.StudentExcep.StudEx;;
//System.out.println("Enter the name,roll no,mark,course:");
public interface StudentInterface {
    boolean AddStudent(AddStud s); 
    void StudDelete(int rollNo);
}
