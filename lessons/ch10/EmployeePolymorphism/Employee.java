/*
  Ethan R. Jones
  3/3/15
  Employee Abstract Class
*/

// Abstract Class - It's a class used only as a template at no point do we ever JUST make an employee class

public abstract class Employee
{
    private String lastName;
    private String firstName;
    private String SSN;

    public Employee(String first, String last, String ssn)
    {
	firstName = first;
	lastName = last;
	SSN = ssn;
    }

    // Should have mutators and default constructor - but time.

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
	return getFirstName() + " " + getLastName() + " " + getSSN();
    }

    // Abstract method in an abstract class means that
    // all subclasses of this class MUST have a function called "earnings."

    // No bodies - They will have them later.
    public abstract double earnings();
}
