package studentlist;

/**
 * This class models student Objects. Students have a name and a student ID
 *
 * @author Liz Dancy, 2021
 */
public class Student {

    private String name;
    private String studentID;

    public Student(String givenName) 
    {
        name = givenName;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String givenName) 
    {
        name = givenName;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }
}
