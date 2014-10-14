/*
Ethan R. Jones 
10-10-14
Ch5 Bonus 
*/

import javax.swing.*;

public class chp5bonus
{
    public static void main(String args [])
    {
	int num1;
	System.out.print ("Enter some text: ");
	while ((num1 = System.in.read()) != '\n')
	    {
		System.out.print ((char) num1);
	    }
    }
}
