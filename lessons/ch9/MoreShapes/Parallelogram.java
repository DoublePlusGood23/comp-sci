/*
  Ethan R. Jones
  2-19-15
  Parallelogram
*/
public class Parallelogram extends Trapazoid
{

    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
	super(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    // Mutators
 
    // Get Functions
    public String toString()
    {
	return "Coordinates of Paraellogram are: " + super.toString() + "\nWidth: " + super.getBase1(); 
    }
}
