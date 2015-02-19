/*
  Ethan R. Jones
  2-19-15
  My Quadrilateral
*/
public class MyQuadrilateral extends Point
{
    private p1;
    private p2;
    private p3;
    private p4;

    public Quadrilateral()
    {
	
    }

    public Quadrilateral(int x1, int y1, int x2, int y2)
    {
	p1 = new Point(x1, y1);
	setRadius(radius);
    }

    // Mutators
    public void setRadius(double radius)
    {
	this.radius = (radius > 0 ? radius : 1);
    }
}
