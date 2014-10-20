/*
Ethan Jones
10-20-14
Messing with Methods
*/

public class methodicalfun
{
    public static void main(String args[])
    {
	System.out.println(distance(0,0,3,4));
    }
    public static double distance(int x1, int y1, int x2, int y2)
    {
	return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
