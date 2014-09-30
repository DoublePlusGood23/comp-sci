/*
Ethan Jones
9-29-14
Ch4 P17
*/
import javax.swing.*;

public class ch4p17
{
    public static void main(String args[])
    {
	int counter = 1;
	String sNumber = "";
	int number = 0;
	int largest1 = 0;
	int largest2 = 0;
	while(counter <= 10)
	    {
		sNumber = JOptionPane.showInputDialog(null, "Number " + counter + "?");
		number = Integer.parseInt(sNumber);
		if(number > largest2)
		    {
			largest2 = number;
		    }
		if(number > largest1)
		    {
			largest2 = largest1;
			largest1 = number;
		    }
		counter++;
	    }
	JOptionPane.showMessageDialog(null, "The First Largest is " + largest1 + ". " + "The Second Largest is " + largest2);
    }
}
