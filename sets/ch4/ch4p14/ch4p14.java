/*
Ethan Jones
9-24-14
Ch4 P14
*/
import javax.swing.*;

public class ch4p14
{
    public static void main(String args[])
    {
	String sWages = "";
	String sHours = "";
	double total = 0;
	double wages = 0;
	double hours = 0;
	int num = 1;
	
	while( num != 4)
	    {
		sWages = JOptionPane.showInputDialog(null, "Wage?"); 
		sHours = JOptionPane.showInputDialog(null, "Employee " + num + " hours?");
		
		total = 0;
		wages = Double.parseDouble(sWages);
		hours = Double.parseDouble(sHours);
		if(hours > 40)
		    {
			total = ((40.00 * wages) + ((hours - 40.00) * (wages * 1.5)));
		    }
		else
		    {
			total = (hours * wages);
		    }
		JOptionPane.showMessageDialog(null, "Employee " + num + " Pay: " + total);
		num++;
	    }
    }
}
