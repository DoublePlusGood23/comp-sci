/*
  Ethan R. Jones
  2-19-15
  My Quadrilateral
*/
public class Quadrilateral extends Point
{
    private p1;
    private p2;
    private p3;
    private p4;

    public Quadrilateral(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)
    {
	p1 = new Point(x1, y1);
	p2 = new Point(x2, y2);
	p3 = new Point(x3, y3);
	p4 = new Point(x4, y4);
    }

    // Mutators
    public Point getPoint1()
    {
	return p1;
    }

    public Point getPoint2()
    {
	return p2;
    }

    public Point getPoint3()
    {
	return p3;
    }

    public Point getPoint4()
    {
	return p4;
    }
    
    // Get Functions
    public String toString()
    {
	return "Coordinates of Quadrilateral:\n" + p1.toString() + "," + p2.toString() + "," +p3.toString() + "," + p4.toString();
    }   
}
