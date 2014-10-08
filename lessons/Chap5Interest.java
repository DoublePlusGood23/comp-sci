/*
Ethan R. Jones
10-7-14
Simple Interest program with for-next, JTextArea, and currency formating.
*/
import javax.swing.*; // JOptionPane, also JTextArea
import java.text.*; // Number format
import java.util.*; // Locale

public class Chap5Interest
{
    public static void main(String args[])
    {
	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.ITALY); // Number Formater - US dollars.
	JTextArea textbox1 = new JTextArea(); // JTextArea (output text box.)
	
	double amount;
	double principal = 10000.00;
	double rate = 0.05;
       
	textbox1.setText("Year\tAmount\n"); // SET the first line of text with .setText
	
	for(int year = 1; year <= 10; year++)
	    {
		amount = principal * Math.pow(1.0 + rate, year);
		textbox1.append(year + "\t" + moneyFormat.format(amount) + "\n"); // Add (append to the textbox.)
	    }
	
	JOptionPane.showMessageDialog(null, textbox1); // Display results inside msgdialog.

    }
}
