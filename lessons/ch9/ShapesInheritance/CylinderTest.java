/*
  Ethan R. Jones
  2-19-15
  Test Class
*/

public class CylinderTest
{
    public static void main(String args[])
    {
	MyCylinder c1 = new MyCylinder(12, 23, 2.5, 5.7);

	System.out.println(c1.getArea());
	System.out.println(c1.getVolume());

	System.out.println(c1.toString());
    }
}
