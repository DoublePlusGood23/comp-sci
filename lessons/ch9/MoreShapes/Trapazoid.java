/*
  Ethan R. Jones
  2-19-15
  Trapazoid
*/
public class Trapazoid extends Quadrilateral
{

    public Trapazoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
	super(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    // Mutators
    public double getArea()
    {
	return ((getBase1() + getBase2()) / 2.0) * getHeight();
    }

    public double getBase1()
    {
	return Math.abs(super.getPoint1().getX() - super.getPoint2().getX());
    }

    public double getBase2()
    {
	return Math.abs(super.getPoint3().getX() - super.getPoint4().getX());
    }

    public double getHeight()
    {
	return Math.abs(super.getPoint1().getY() - super.getPoint3().getY());
    }
    
    // Get Functions
    public String toString()
    {
	return super.getPoint1().toString() + "," + super.getPoint2().toString() + "," + super.getPoint3().toString() + "," + super.getPoint4().toString() + "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
    }
}
