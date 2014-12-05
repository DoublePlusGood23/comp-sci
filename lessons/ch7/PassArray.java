/*
  Ethan R. Jones
  12/04/2014
  Passing Arrays through Classes
*/

import javax.swing.*;
import java.util.*;

public class PassArray
{
    public static void main(String args[])
    {
	int numList[] = {1, 4, 9, 16, 25};
	int numList2[] = {12, 3, 16, 8, 20, 10, 3};
	
	//	System.out.println(modifyElement(numList[2]));  // 18
	modifyElement(numList[2]);
	System.out.println("== numList Pass-by! ==");
	System.out.println(numList[2]);  // 9
	
	System.out.println("");
	System.out.println("");

	printArray(numList);
	System.out.println("== numList Sorted! ==");
	modifyArray(numList);
	printArray(numList);
	
	System.out.println("");
	System.out.println("");
	
	printArray(numList2);
	System.out.println("== numList2 Sorted! ==");
	sortArray(numList2);
	printArray(numList2);

	int search = Integer.parseInt(JOptionPane.showInputDialog("Enter number to find."));
	System.out.println("Element found at location #" + linearSearch(numList2, search));
    }

    // Linear search, looks for index of $key or returns -1.
    public static int linearSearch(int num[], int key)
    {
	for(int x = 0; x < num.length; x++)
	    {
		if(num[x] == key)
		    {
			return x;
		    }
	    }
	return -1;
    }
    
    // Pass by value (changes are not kept, modifying a copy)
    public static void modifyElement(int num)
    {
	num = num * 2;
    }

    // Pass by reference (All arrays in Java are passed this way - changes are kept)
    public static void modifyArray(int num[])
    {
	for(int x = 0; x < num.length; x++)
	    {
		num[x] *= 2;
	    }
    }

    public static void printArray(int num[])
    {
	for(int x = 0; x < num.length; x++)
	    {
		System.out.println(x + "\t" + num[x]);
	    }
    }

    public static void sortArray(int num[])
    {
	// BUBBLE SORT! - Exchanging adjacent locations which are out of order.

	for(int pass = 1; pass < num.length; pass++)
	    {
		for(int element = 0; element < num.length - 1; element++)
		    {
			if(num[element] > num[element +1])
			    {
				int temp = num[element];
				num[element] = num[element + 1];
				num[element + 1] = temp;
			    }
		    }
	    }
    }
}
