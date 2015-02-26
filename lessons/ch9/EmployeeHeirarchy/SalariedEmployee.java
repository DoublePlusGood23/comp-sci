// Salaried Employee class
public class SalariedEmployee extends Employee
{
    private double salary;

    public SalariedEmployee()
    {
	// Empty - Default constructor class.
    }

    public SalariedEmployee(String first, String last, String SSN, double salary)
    {
	super(first, last, SSN);
	setSalary(salary);
    }

    // Mutators

    public void setSalary(double s)
    {
	salary = s;
    }


    public double getSalary()
    {
	return salary;
    }

    public String toString()
    {
	return "Salaried Employee: " + super.toString() + "\nSalary: " + getSalary();
    }
}
