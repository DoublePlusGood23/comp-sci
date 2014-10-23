/*
Ethan R. Jones
10-16-14
Ch4 P32b
*/

import javax.swing.*;

public class ch4p32b
{
    public static void main(String args [])
    {
        double eV = 1.0;
	System.out.println("Top of main()");
	for(int x = 1; x <= 12; x++)
	    {
		eV =+ (1.0/(factorial(x)));
	    }
	System.out.println("e = " + eV);
    }
    public static int factorial(int n)
    {
	int fact;
	if(n == 1)
	    {
		return 1;
	    }
	else
	    {
		fact = n * factorial(n-1);
	    }
	return fact;
    }
}

