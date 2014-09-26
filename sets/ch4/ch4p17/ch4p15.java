/*
Ethan Jones
9-25-14
Ch4 P15
*/
import javax.swing.*;

public class ch4p15
{
    public static void main(String args[])
    {
	int counter = 1;
	String sNumber = "";
	int number = 0;
	int largest = 0;
	while(counter <= 10)
	    {
		sNumber = JOptionPane.showInputDialog(null, "Number " + counter + "?");
		number = Integer.parseInt(sNumber);
		if(number > largest)
		    {
		       largest = number;
		    }
		counter++;
	    }
	JOptionPane.showMessageDialog(null, "The Largest is " + largest);
    }
}
