/*
Ethan R. Jones 
9-16-2014
Avg Format
*/

import javax.swing.*; // JOptionPane.
import java.text.*; // Decimal format.

public class averageFormat
{
    public static void main (String args [])
    {
	int total; // Sum of grades
	int gradeCount; // How many grades
	int grade; // One grade entered for each student
	
	double average; //Actual average (decimal)
	
	// Which of these need initalized, and why?
	// Any Variable which accumulates needs initalized
	
	gradeCount = 0;
	total = 0;
	
	String tempGrade;
	
	// Set up your decimal formatting
	// Clasname identifier = new Classname(...);

	DecimalFormat twoDigit = new DecimalFormat("0.00");
	
	// Get the inital input before the while loop.
	tempGrade = JOptionPane.showInputDialog("Enter a grade or -1 to quit");
	grade = Integer.parseInt(tempGrade);
	
	while(grade != -1)
	    {
		total += grade; // total + total = grade
		gradeCount++;

		// Finish thw while loop with the same input as above the while loop
		tempGrade = JOptionPane.showInputDialog("Enter a grade or -1 to quit");
		grade = Integer.parseInt(tempGrade);
	    }
	
	// total and grade count are BOTH intergers so division == int even if the avg is really a double!
	
	average = (double)total / (double)gradeCount;
	
	JOptionPane.showMessageDialog(null, "The average is " + twoDigit.format(average));
    }
}
