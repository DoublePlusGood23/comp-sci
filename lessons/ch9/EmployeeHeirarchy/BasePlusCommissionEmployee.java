// Base Plus Commission Employee class
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double base;

    public BasePlusCommissionEmployee()
    {
	// Empty - Default constructor class.
    }

    public BasePlusCommissionEmployee(String first, String last, String SSN, double s, double p, double b)
    {
	super(first, last, SSN, s, p);
	setBase(b);
    }

    // Mutators

    public void setBase(double b)
    {
	base = b;
    }
    
    // Gets
    public double getBase()
    {
	return base;
    }

    public String toString()
    {
	return "Base Plus Commission Employee: " + super.toString() + getBase();
    }
}
