/*
Ethan R. Jones
9-23-14
ch4p13
*/

import javax.swing.*;

public class ch4p13
{
    public static void main(String args[])
    {
	/*
	item1 = 239.99;
	item2 = 129.75;
	item3 = 99.95;
	item4 = 350.89;
	*/

	double total = 0;

        String sItem1 =JOptionPane.showInputDialog(null, "Number of item 1 sold?");
	double item1 = Double.parseDouble(sItem1);
	
	String sItem2 =JOptionPane.showInputDialog(null, "Number of item 2 sold?");
	double item2 = Double.parseDouble(sItem2);
	
	String sItem3 =JOptionPane.showInputDialog(null, "Number of item 3 sold?");
        double item3 = Double.parseDouble(sItem3);
	
	String sItem4 =JOptionPane.showInputDialog(null, "Number of item 4 sold?");
        double item4 = Double.parseDouble(sItem4);
	
	total = (( (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89) ) * .09) + 200;

	JOptionPane.showMessageDialog(null, "Total Payment: " + total);
    }
}
