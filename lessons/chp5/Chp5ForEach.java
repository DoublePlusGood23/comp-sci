/*
Ethan R.Jones
10-6-14
Leaning Array Lists & For Each loops
*/

import java.util.*; // Needed for Array Lists, for-each loops are in the stdlib.

public class Chp5ForEach
{
    public static  void main(String args[])
    {
	ArrayList<String> nameList = new ArrayList<String>();
	
	nameList.add("Noah"); // Adds String to array!
	nameList.add("Ethan");
	nameList.add("Jake");
	
	System.out.println("\nFirst Loop\n");
	
	for(int x = 0; x <= 2; x++) // For-Next loop with the exact list size 
	    {
		System.out.println(nameList.get(x)); //nameList[0]
		
	    }

	System.out.println("\nSecond Loop\n");

	for(int y = 0; y < nameList.size(); y++)
	    {
		System.out.println(nameList.get(y));
	    }
	
	System.out.println("\nThird Loop\n");
	
	for(String name : nameList) // for-each "name" in the list 
	    {
		System.out.println(name);
	    }
	
	System.out.println("\nFourth Loop\n");
	
	for(int i = 1, j = 1; i <= 10 && j <= 10; i++, j++)
	    {
		System.out.println(i + "," + j);
	    }
    }
}
