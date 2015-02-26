// Commission Employee class
public class CommissionEmployee extends Employee
{
    private double sale;
    private double percent;

    public CommissionEmployee()
    {
	// Empty - Default constructor class.
    }

    public CommissionEmployee(String first, String last, String SSN, double s, double p)
    {
	super(first, last, SSN);
	setSale(s);
	setPercent(p);
    }

    // Mutators

    public void setSale(double s)
    {
	sale = s;
    }

    public void setPercent(double p)
    {
	percent = p;
    }

    // Gets
    public double getSale()
    {
	return sale;
    }

    public double getPercent()
    {
	return percent;
    }

    public String toString()
    {
	return "Commission Employee: " + super.toString() + "\nSale: " + getSale() + "\nPercent: " + getPercent();
    }
}
