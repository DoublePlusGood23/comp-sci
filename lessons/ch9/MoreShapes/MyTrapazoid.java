/*
  Ethan R. Jones
  2-19-15
  Trapazoid
*/
public class Trapazoid extends Quadrilateral
{

    public Trapazoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
	super(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    // Mutators
    public int area()
    {
	return super.getPoint1().getX() super.getPoint2.getY() ;
    }
    // Get Functions
    public String toString()
    {
	return "" + p1.toString() + "," + p2.toString() + "," +p3.toString() + "," + p4.toString();
    }
}
