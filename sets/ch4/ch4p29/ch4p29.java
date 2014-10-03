/*
Ethan R. Jones
10-2-14
Ch4 P29
*/
import javax.swing.*;

public class ch4p29
{
    public static void main(String args [])
    {
	String sNum1 = JOptionPane.showInputDialog("Enter side 1");
	String sNum2 = JOptionPane.showInputDialog("Enter side 2");
	String sNum3 = JOptionPane.showInputDialog("Enter side 3");
	
	int a = Integer.parseInt(sNum1);
	int b = Integer.parseInt(sNum2);
	int c = Integer.parseInt(sNum3);
	
	if( ((a + b) > c) && ((a + c) > b) && ((b + c) > a))
	    {
		System.out.println("Valid triangle.");
	    }
	else
	    {
		System.out.println("Not a valid triangle.");
	    }
    }
}
