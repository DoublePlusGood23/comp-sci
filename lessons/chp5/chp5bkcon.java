/*
Ethan R. Jones
10-8-14
Chp5 Breaks and Continues.
*/
public class chp5bkcon
{
    public static void main(String args [])
    {
	for(int x = 1; x <= 10; x++)
	    {
		if(x == 5)
		    {
			continue;
		    }
		System.out.println(x);
	    }
    sweg:{
	    for(int r = 1; r <= 10; r++)
		{
		    for(int c = 1; c <= 5; c++)
			{
			    if(c == 3)
				{
				    break sweg;
				}
			    System.out.print(r);
			}
		    System.out.println();
		}
	}
    }
}
