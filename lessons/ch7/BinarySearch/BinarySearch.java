/*
  Ethan R. Jones
  12/08/14
  Binary Search Fun!
*/

import java.awt.*;
import java.awt.event.*;	// ActionListener
import java.applet.*;
import java.text.*;			// Font
import javax.swing.*;

public class BinarySearch extends JApplet implements ActionListener
{
    JLabel enterLabel, resultLabel;
    JTextField enterField, resultField;
    JTextArea output;

    int array[];
    String display = "";

    public void init()
    {
	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());

	enterLabel = new JLabel("Enter integer search key");
	form1.add(enterLabel);

	enterField = new JTextField(10);
	form1.add(enterField);
	enterField.addActionListener(this);

	resultLabel = new JLabel("Result");
	form1.add(resultLabel);

	resultField = new JTextField(20);
	form1.add(resultField);
	resultField.setEditable(false);

	output = new JTextArea(6,60);
	output.setFont(new Font("Monospaced", Font.PLAIN, 12));
	form1.add(output);

	array = new int[15];

	for(int x=0;x<array.length;x++)
	    {
		array[x] = x * 3;
	    }
    }

    public void actionPerformed(ActionEvent e)
    {
	String key = enterField.getText();
	int searchKey = Integer.parseInt(key);

	display = "Searching Array... \n";

	int element = binarySearch(array, searchKey);

	output.setText(display);

	if(element==-1)
	    {
		resultField.setText("Value not found");
	    }
	else
	    {
		resultField.setText("Element found at location #" + element);
	    }
    }

    public int binarySearch(int a[], int key)
    {
	int low = 0;
	int high = a.length-1;
	int mid;

	while(low<=high)
	    {
		mid = (low + high)/2;

		buildOutput(a, low, mid, high);

		if(key == a[mid])
		    {
			return mid;
		    }
		else if(key < a[mid])
		    {
			high = mid - 1;
		    }
		else if(key > a[mid])
		    {
			low = mid + 1;
		    }
	    }

	return -1;
    }

    public void buildOutput(int a[], int low, int mid, int high)
    {
	DecimalFormat twoDigit = new DecimalFormat("00");

	for(int x=0;x<a.length;x++)
	    {
		if(x<low || x>high)
		    {
			display+="    ";
		    }
		else if(x==mid)
		    {
			display+=twoDigit.format(a[x]) + "* ";
		    }
		else
		    {
			display+=twoDigit.format(a[x]) + "  ";
		    }
	    }

	display+="\n";
    }
}
