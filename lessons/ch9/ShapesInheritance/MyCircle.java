/*
  Ethan R. Jones
  18-2-15
  MyCircle Subclass
*/

public class MyCircle extends MyPoint
{
    private double radius;

    public MyCircle()
    {
	
    }

    public MyCircle(int x, int y, double radius)
    {
	// Superclass constructor
	super(x,y);

	setRadius(radius); // Ensure that r > 0
    }

    // Mutators
    public void setRadius(double radius)
    {
	this.radius = (radius > 0 ? radius : 1);
    }

    public double getRadius()
    {
	return radius;
    }

    public double getDiameter()
    {
	return 2 * getRadius();
    }

    public double getCircumference()
    {
	return Math.PI * getDiameter();
    }

    public double getArea()
    {
	return Math.PI * Math.pow(getRadius(), 2);
    }

    // toString Functions
    public String toString()
    {
	return "Center = " + super.toString() + "  Radius = " + getRadius();
    }
}
