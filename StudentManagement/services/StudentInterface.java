package StudentManagement.services;

public interface StudentInterface {
    boolean AddStudent(AddStud s); 
    void StudDelete(int rollNo) throws Exception;
    void StudDetails();
    void Update(int rollNo,AddStud s) throws Exception;
    void findTopper() throws Exception;

}
