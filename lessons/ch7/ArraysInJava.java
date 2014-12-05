/*
  Ethan R. Jones
  2-12-14
  Arrays in Java ('bout time)
*/

import javax.swing.*;
import java.util.*;

public class ArraysInJava
{
    public static void main(String args[])
    {
	int size = Integer.parseInt(JOptionPane.showInputDialog("Enter Size!")); // Size of array
	int key = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search for!")); // Number being searched for.
	int num[] = new int[size]; // Array init

	for(int x = 0; x < num.length; x++) // Loop based on Array size
	    {
	        num[x] = (int)(Math.random() * 100 + 1); // Set rnd vals
	    }

	Arrays.sort(num); // Sorts Array for text formatting and sorting.

	for(int x = 0; x < num.length; x++)
	    {
		System.out.println(x + "\t" + num[x]); // Output values
	    }
	
	int foundAt = Arrays.binarySearch(num, key); // Search for $key in $num.
	System.out.println("Element found at indice #" + foundAt); // Output where it was found in the array
    }
}
