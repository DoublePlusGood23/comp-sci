/*
  Ethan R. Jones
  2-19-15
  Trapazoid
*/
public class Trapazoid extends Quadrilateral
{

    public Trapazoid(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)
    {
	super(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    // Mutators
    public float getArea()
    {
	return ((getBase1() - getBase2()) * getHeight()) / 2.0;
    }

    public float getBase1()
    {
	return Math.abs(super.getPoint1().getX() - super.getPoint2().getX());
    }

    public float getBase2()
    {
	return Math.abs(super.getPoint3().getX() - super.getPoint4().getX());
    }

    public float getHeight()
    {
	return Math.abs(super.getPoint1().getY() - super.getPoint3().getY());
    }
    
    // Get Functions
    public String toString()
    {
	return "Coordinates of Trapazoid are:\n" + super.getPoint1.toString() + "," + super.getPoint2.toString() + "," + super.getPoint3.toString() + "," + super.getPoint4.toString() + "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
    }
}
