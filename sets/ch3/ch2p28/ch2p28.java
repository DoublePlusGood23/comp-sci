/*
Ethan R. Jones
10-20-2014
ch2p28 
*/

import javax.swing.*;

public class ch2p28
{
    public static void main(String args[])
    {
	String sNum1 = JOptionPane.showInputDialog(null, "Enter first number.");
	String sNum2 = JOptionPane.showInputDialog(null, "Enter second number");
	
	int num1 = Integer.parseInt(sNum1);
	int num2 = Integer.parseInt(sNum2);
	
	if(num2 % num1 == 0)
	    {
		JOptionPane.showMessageDialog(null, num1 + " is a multiple of " + num2 + ".");
	    }
    }
} 
