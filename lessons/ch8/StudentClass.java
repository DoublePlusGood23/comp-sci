/*
  Ethan R. Jones
  1-21-15
  Classes in Java (finally learning how2class)
*/

class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;

    public Student()
    {
	firstName = "John";
	lastName = "Doe";
	gradeLevel = 9;	
    }

    public void setFirstName(String fName)
    {
	firstName = fName;
    }

    public void setLastName(String lName)
    {
	lastName = lName;
    }

    public void setGradeLevel(int gl)
    {
	gradeLevel = (gl >= 1 && gl <= 12 ? gl : 0);
    }

    public String toString()
    {
	return lastName + ", " + firstName + "\tGrade: " + gradeLevel; 
    }
    
}

public class StudentClass
{
    public static void  main(String args[])
    {
	// Create a generic default Student (constructor)
	Student student = new Student();

	student.setFirstName = "Keith";
	student.setLastName = "Ensminger";
	student.setGradeLevel(12);

	System.out.println(student.toString());
    }
}
