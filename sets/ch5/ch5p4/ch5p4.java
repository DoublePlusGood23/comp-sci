/*
Ethan R. Jones
10-16-2014
Ch5 P4
*/

public class ch5p4
{
    public static void main(String args [])
    {
	int n = 10;
	for(int x = 1; x <= 10; x++)
	    {
		for(int y = 10-n; y >= 1; y--)
		    {
			System.out.print(" ");
		    }
		for(int z = n; z >= 1; z--)
		    {
			System.out.print("*");			
		    }
		n--;
		System.out.println("");
	    }
    }
}
