/*
Ethan Jones 
10-16-14
Ch5 P5
*/

import javax.swing.*;

public class ch5p5
{
    public static void main(String args[])
    {
	/*
	  WHILE LOOP FOR INPUT
	  CASE STATEMENTS CHECK FOR VOWELS ONLY. ADD ONE TO COUNTER.
	  DEFAULT DOES NOTHING, Z WILL KILL THE LOOP.
	*/
	String sInput = JOptionPane.showInputDialog("Enter letter (Z to exit.)");
	String uInput = sInput.toUpperCase();
	int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0, vowelY = 0;
	do
	    {
	    sLoop:
		{
		    switch(uInput)
			{
			case "A":
			    vowelA++;
			    break;
			case "E":
			    vowelE++;
			    break;
			case "I":
			    vowelI++;
			    break;
			case "O":
			    vowelO++;
			    break;
			case "U":
			    vowelU++;
			    break;
			case "Y":
			    vowelY++;
			    break;
			case "Z":
			    break sLoop;
			default:
			    continue;
			}
		}
	    }
	
	System.out.println("A: " + vowelA + " E: " + vowelE + " I: " + vowelI + " O: " + vowelO + " U: " + vowelU + " Y: " + vowelY);
    }
}
