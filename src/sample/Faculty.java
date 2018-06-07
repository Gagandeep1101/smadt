
package sample;

public abstract class Faculty extends Person implements IPrint{
    
    private int empID;
    private String courseName;
    
    public Faculty(){
        
    }

    public Faculty(int empID, String courseName) {
        this.empID = empID;
        this.courseName = courseName;
    }
    
    

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    @Override
    public void print() {
      
    } 
    
}
