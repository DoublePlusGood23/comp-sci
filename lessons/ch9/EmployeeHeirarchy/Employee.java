// Employee Class

public class Employee
{
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee(String f, String l, String SSN)
    {
	setFirstName(f);
	setLastName(l);
	setSSN(SSN);
    }

    public Employee()
    {
	// Empty - Default constructor
    }

    // Mutators

    public void setFirstName(String first)
    {
	firstName = first;
    }

    public void setLastName(String last)
    {
	lastName = last;
    }

    public void setSSN(String SSN)
    {
	this.SSN = SSN;
    }

    // Get functions.

    public String getFirstName()
    {
	return firstName;
    }

    public String getLastName()
    {
	return lastName;
    }

    public String getSSN()
    {
	return SSN;
    }

    public String toString()
    {
	return getFirstName() + " " + getLastName() +  "\nSSN: " + getSSN();
    }
}
