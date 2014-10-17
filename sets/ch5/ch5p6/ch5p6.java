/*
Ethan R. Jones
10-17-14
Doing prime stuff
*/

public class ch5p6
{
    public static void main(String args[])
    {
	for(int x = 1; x <= 1000; x++)
	    {
		if(fPrime(x) == true)
		    {
			System.out.println(x + " is prime.");
		    }
	    }
    }
    public static boolean fPrime(int i)
    {
	if(i <= 3) // Is n 1,2 or 3?
	    {
		return i > 1; // 2 and 3 will be TRUE, 1 will be FALSE
	    }
	else if(i % 2 == 0 || i % 3 == 0) // i % 2 means that an even WILL work so it must be false, checks for 3 multi as well.
	    {
		return false;
	    }
	else
	    {
		for(int x = 5; x * x <= i; x += 6)
		    {
			if(i % x == 0 || i % (x + 2) == 0) // Checking the last remaining numbers.
			    {
				return false; 
			    }
		    }
		return true;
	    }
    }
}
