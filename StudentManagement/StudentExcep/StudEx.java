package StudentManagement.StudentExcep;

public class StudEx extends Exception {
    String s;
    public StudEx(){
        super();
    }
    public StudEx(String s){
        this.s=s;
    }
    public String toString(){
        return s;
    }
}
