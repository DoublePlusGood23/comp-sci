/*
Ethan R. Jones
10-14-14
Pi Program
*/

import javax.swing.*;

public class ch5p1
{
    public static void main(String args [])
    {
	double piTotal = 0;
	boolean plus = true;
	// 4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13 - 4/15 + 4/17 - 4/19...
	for(int x = 1; x < 1000; x+=2)
	    {
		if(plus == true)
		    {
			piTotal = piTotal + (double)4/x;
			plus = false;
		    }
		else
		    {
			piTotal = piTotal - (double)4/x;
			plus = true;
		    }
		System.out.println("Total: " + piTotal);
	    }
    }
}
