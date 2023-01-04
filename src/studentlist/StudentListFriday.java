
package studentlist;

/**
 * This class ++++Insert description here +++
 * @author Liz Dancy, 2021
 */
public class StudentListFriday 
{

    /**
     * Main method creates an array of Student Objects and
     * iterates over the array to print each student's name.
     */
    public static void main(String[] args) 
    {
       Student[] students = new Student[6];
       students[0] = new Student("Gabe");
       students[1] = new Student("Pranav");
       students[2] = new Student("Muhammad");
       students[3] = new Student("Lucas");
       students[4] = new Student("Chris");
       Student s1 = new Student("Liz");
       //students[0] = s1;
       for(Student s: students)
       {
           System.out.println(s.getName());
       }
    }

}
