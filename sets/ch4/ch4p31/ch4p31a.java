/*
Ethan R. Jones
10-3-14
Ch4 P31
*/

import javax.swing.*;

public class ch4p31a
{
    public static void main (String args[])
    {
	int scode = Integer.parseInt(JOptionPane.showInputDialog("Enter secret code."));
	int[] digits = new int[4];
	int tempvar = 0;
	/* Take digit add seven, then mod by 10, return the remainder. Swap 1st digit with 3d digit and 2d with 4th. PRINT ANSWER. */
	for(int x = 3; x >= 0; x--)
	    {
		digits[x] = (((scode % 10) + 7) % 10);
		scode = scode / 10;
	    }
	tempvar = digits[2];
	digits[2] = digits[0];
	digits[0] = tempvar;
	tempvar = digits[3];
	digits[3] = digits[1];
	digits[1] = tempvar;
	for(int x = 0; x <= 3; x++)
	    {
		System.out.print("" + digits[x]);
	    }
    }
}
