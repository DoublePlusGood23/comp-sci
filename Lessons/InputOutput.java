/* Ethan R. Jones
 * 8-27-2014
 * Period 3
 * Input & Output
 ****************/

 import javax.swing.*;

 public class InputOutput
 {
 	public static void main(String args[])
 	{
 		// Declaring varibles
 		int num1, num2, sum;

 		// Getting Strings
 		String sNum1 = JOptionPane.showInputDialog("Enter first number: ");
 		String sNum2 = JOptionPane.showInputDialog("Enter second number: ");

 		// Changing STR -> INT
 		num1 = Integer.parseInt(sNum1);
 		num2 = Integer.parseInt(sNum2);

 		// Add the two numbers together
 		sum = num1 + num2;

 		// Output the sum
 		System.out.println(sum);
 		JOptionPane.showMessageDialog(null, sum);
 	}
 }