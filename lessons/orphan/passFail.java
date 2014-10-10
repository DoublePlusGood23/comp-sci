/*
Ethan R. Jones
9-17-14
While loop fun!
*/
import javax.swing.*;

public class passFail
{
    public static void main(String args[])
    {
	int pass=0;
	int fail=0;
	
	int studentCount=1; // 1st Student
	int result;

	String input;
	String output;
	
	while(studentCount<=10)
	    {
		input = JOptionPane.showInputDialog("Enter result 1 for pass 2 for fail.");
		result = Integer.parseInt(input);
		if(result == 1)
		    pass++;
		else
		    fail++;
		studentCount++;
	    }
	output = "Passed: " + pass + "\nFailed:" + fail;
	
	if(pass>=8)
	    output += "\nCongrats on the excellent teaching!";
	else
	    output += "\nYou need to do a better job";
	JOptionPane.showMessageDialog(null,output);
    }
}
