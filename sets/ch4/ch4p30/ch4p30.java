/*
Ethan R. Jones
10-2-14
Ch4 P30
*/
import javax.swing.*;

public class ch4p30
{
    public static void main(String args [])
    {
	String sNum1 = JOptionPane.showInputDialog("Enter side 1");
	String sNum2 = JOptionPane.showInputDialog("Enter side 2");
	String sNum3 = JOptionPane.showInputDialog("Enter side 3");
	
	int a = Integer.parseInt(sNum1);
	int b = Integer.parseInt(sNum2);
	int c = Integer.parseInt(sNum3);
	
	if((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2))
	    {
		System.out.println("Valid right triangle.");
	    }
	else
	    {
		System.out.println("Not a valid right triangle.");
	    }
    }
}
