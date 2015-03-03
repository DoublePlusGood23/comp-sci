// Salaried Employee class

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String SSN, double salary)
    {
	super(first, last, SSN); // Call Employee constructor

	weeklySalary = (salary >= 0 ? salary : 0);
    }

    // This must be here to satisfy the superclass earnings.
    public double earnings()
    {
	return weeklySalary;
    }

    public String toString()
    {
	return "Salaried Employee: " + super.toString();
    }
}
