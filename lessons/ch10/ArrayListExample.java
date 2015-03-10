/*
  Ethan R. Jones
  3-10-15
  Array List Example!
*/

import java.util.*; // imports the proper library.

public class ArrayListExample
{
    public static void main(String args[])
    {
	ArrayList<String> names = new ArrayList<String>();

	names.add("Brad"); // 0
	names.add("Dave"); // 1
	names.add("Winston"); // 2

	// For-next (counter)
	for(int x = 0; x < names.size(); x++)
	    {
		System.out.println(names.get(x))
		    }

	// For-each (for each name in a your list of names)
	for(String name : names)
	    {
		System.out.println(name);
	    }
	
	names.add(2, "Roger"); // Brad, Dave, Roger, Winston
	names.set(1, "George"); // Brad George, Roger, Winston
	names.remove(0); // George, Roger, Winston
	names.remove(names.indexOf("Roger")); // George Wiston
	names.add("Elizabeth"); // Equality! (still a 1:4 ratio...)
	
	for(String name : names)
	    {
		if(name.equals "Winston")
		    {
			System.out.println("Found him!");
		    }
	    }
    }
}
