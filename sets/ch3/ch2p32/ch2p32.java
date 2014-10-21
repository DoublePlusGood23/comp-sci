/*
Ethan R. Jones
10-20-2014
ch2p32
*/

import javax.swing.*;

public class ch2p32
{
    public static void main(String args[])
    {
	String sInput = JOptionPane.showInputDialog("Enter 5 digit number");
	int input = Integer.parseInt(sInput);

	for(int x = 1; x <= 5; x++)
	    {
		System.out.print("" + input % 10 + "   ");
		input /= 10;
	    }

	System.out.println("");
    }
}
