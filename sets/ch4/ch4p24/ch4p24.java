/*
Ethan R. Jones
10-1-14
Ch4 P24
*/
import javax.swing.*;

public class ch4p24
{
    public static void main(String args [])
    {

	// Declare Variables
	int[] p = new int [5];
	int num;
	
	// Get Input
	String sNum = JOptionPane.showInputDialog("Enter five digit number: ");
	num = Integer.parseInt(sNum);
	
	// Seperation Loop
	for(int b = 0; b < 5; b++) 
       	    {
		switch(b)
		    {
		    case 0: 
			p[b] = num / 10000;
			num %= 10000;
			break;
		    case 1:
			p[b] = num / 1000;
			num %= 1000;
			break;
		    case 2:
			p[b] = num / 100;
			num %= 100;
			break;
		    case 3:
			p[b] = num / 10;
			num %= 10;
			break;
		    case 4: 
			p[b] = num / 1;
			num %= 1;
			break;
		    }
       	    }
	
	// Determine if it's a palendrome.
	if( p[0] == p[4] && p[1] == p[3])
	    {
		System.out.println("Is palendrome.");
	    }
	else
	    {
		System.out.println("Not a palendrome.");
	    }
    }
}
