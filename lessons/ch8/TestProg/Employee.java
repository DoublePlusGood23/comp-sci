// Fig. 8.10: Employee.java
// Employee class declaration.

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // Static is a class-wide of information
    // in other words, every object of the class knows the count.
    private static int count = 0;
    
    // constructor to initialize name, birth date and hire date
    public Employee( String first, String last, Date dateOfBirth, 
		     Date dateOfHire )
    {
	firstName = first;
	lastName = last;
	birthDate = dateOfBirth;
	hireDate = dateOfHire;

	count++;
    }

    public static int getCount()
    {
	return count;
    }

    // convert Employee to String format
    public String toEmployeeString()
    {
	return lastName + ", " + firstName +  
	    "  Hired: " + hireDate.toDateString() +  
	    "  Birthday: " + birthDate.toDateString();
    }

} // end class Employee
