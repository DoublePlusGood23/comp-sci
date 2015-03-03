// Hourly %Employee class

public class HourlyEmployee extends Employee
{
    private double rate;
    private double hours;

    public HourlyEmployee(String first, String last, String SSN, double r, double h)
    {
	super(first, last, SSN); // Call Employee constructor

	rate = (r >= 0 ? r : 0);
	hours = (h >= 0 ? h : 0);
    }

    // This must be here to satisfy the superclass earnings.
    public double earnings()
    {
	return rate * hours;
    }

    public String toString()
    {
	return "Hourly Employee: " + super.toString();
    }
}
