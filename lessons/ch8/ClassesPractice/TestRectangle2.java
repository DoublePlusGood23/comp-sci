/*
  Ethan R. Jones
  2-11-14
  Test class for Rectangle2
*/

import java.util.*;

public class TestRectangle2
{
    public static void main(String args[])
    {
	Rectangle2[] rekt;
	rekt = new Rectangle2[10];
	
	Random random = new Random();
	
	for(int x = 0; x < rekt.length; x++)
	    {
		int x1 = random.nextInt(500);
		int y1 = random.nextInt(500);
		int x2 = random.nextInt(500);
		int y2 = random.nextInt(500);

		rekt[x] = new Rectangle2(x1,y1,x2,y2);
	    }

	for(int x = 0; x < rekt.length; x++)
	    {
		System.out.println(rekt[x].toString());
		System.out.println("Area = " + rekt[x].area());
	    }
	
	for(Rectangle2 r : rekt)
	    {
		System.out.println(r.toString());
		System.out.println(r.perimeter());
	    }
    }
}
