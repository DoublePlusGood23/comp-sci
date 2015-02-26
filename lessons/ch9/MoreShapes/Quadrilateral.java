/*
  Ethan R. Jones
  2-19-15
  My Quadrilateral
*/
public class Quadrilateral extends Point
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
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
