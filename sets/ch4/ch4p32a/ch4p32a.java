/*
Ethan R. Jones
10-16-14
Ch4 P32a
*/

import javax.swing.*;

public class ch4p32a
{
    public static void main(String args [])
    {
	int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number."));
	System.out.println("!" + num + " = " + factorial(num));
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

