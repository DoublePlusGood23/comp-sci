/*
Ethan Jones
9-29-14
Ch4 P25
*/
import javax.swing.*;

public class ch4p25
{
    public static void main (String args[] )
    {	
	String sNum = JOptionPane.showInputDialog("Enter Binary Number");
	int num = Integer.parseInt(sNum, 2);
	System.out.println("Integer Form: " + num);
    }
}
