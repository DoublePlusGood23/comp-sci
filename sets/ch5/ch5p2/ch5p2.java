/*
Ethan R. Jones
10-16-14
Ch5 P2
*/

import javax.swing.*;

public class ch5p2
{
    public static void main(String args [])
    {
	JTextArea textbox1 = new JTextArea();
	textbox1.setText("Number\tFactoral\n");
	for(int x = 1; x <= 13; x++)
	    {
		textbox1.append(x + "\t" + factorial(x) + "\n");
	    }
	JOptionPane.showMessageDialog(null, textbox1);
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

