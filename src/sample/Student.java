
package sample;


public class Student extends Person implements IPrint{
    
    private int studentID;
    private String schoolName;
    
    public Student(){
        
    }
    

    public Student(int studentID, String schoolName, String name, int age) {
        super(name, age);
        this.studentID = studentID;
        this.schoolName = schoolName;
    }
    
   

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    @Override
    public void print() {
        System.out.println("Student Name  :"+this.getName()
                +"\n Age of Student : "+this.getAge()+"\n Student ID : "+this.getStudentID()
        +"\n School Name : "+this.getSchoolName());
      
    } 
    
}
