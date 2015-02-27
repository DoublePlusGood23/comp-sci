// Hourly Employee

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    public HourlyEmployee()
    {
	// Empty - Default constructor class.
    }

    public HourlyEmployee(String first, String last, String SSN, double w, double h)
    {
	super(first, last, SSN);
	setWage(w);
	setHours(h);
    }

    // Mutators

    public void setWage(double w)
    {
	wage = (w > 0 ? w : 7.5);
    }

    public void setHours(double h)
    {
	hours = (h >= 0 && h <= (7 * 25) ? h : 0);
    }

    public double getWage()
    {
	return wage;
    }

    public double getHours()
    {
	return hours;
    }

    public String toString()
    {
	return super.toString() + "\nHours: " + getHours() + "\nWage: " + getWage();
    }
}
