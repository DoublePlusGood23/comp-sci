/*
  Ethan R. Jones
  11-13-2014
  String Comparsion
*/

public class stringCompare
{
    public static void main(String args[])
    {
	String word1 = "hello";
	String word2 = "goodbye";

	String word3 = new String("hello");
	String word4 = new String("goodbye");

	String word5 = "hello";

	if(word3.equals("hello"))
	    {
		System.out.println("True");
	    }
	else
	    {
		System.out.println("False"); 
	    }

	// Compare To - alphabetical order
	// word1.compareTo(word2)

	System.out.println(word1.compareTo(word1));
	// 1, because HELLO is after GOODBYE by one letter. 

	System.out.println(word2.compareTo(word1));
	// -1 because GOODBYE is before HELLO by one letter.

	System.out.println(word1.compareTo(word3));
	// 
    }
}	
