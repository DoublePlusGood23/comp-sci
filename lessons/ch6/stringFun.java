/*
  Ethan R. Jones
  11-12-2014
  Notes on having fun with Strings!
*/

public class stringFun
{
    public static void main(String args[])
    {
	// String is not a primitive type
	String word1 = "apple";
	String word2 = new String("apple");
	char letters[] = {'a','p','p','l','e'};
	String word3 = new String(letters);
	
	// All the same string even if different types.
	System.out.println(word1);
	System.out.println(word2);
	System.out.println(word3);
	
	// Prints length.
       	System.out.println(word1.length());
	
	// Substring goes from that number to end of the word.
	String word4 = "prepackaged";
	
	// Packaged.
	String subword4a = word4.substring(4);
	
	// Pack.
	String subword4b = word4.substring(3,7); // Up to and including 6.
	
	System.out.println(recombine("swag", "yolo"));
	
	word5 = "abcdefabcdefabcdef";
	
	System.out.println(word5.indexOf("c")); // 2
	System.out.println(word5.indexOf("def")); // 3
	System.out.println(word5.indexOf("z")); // -1
	System.out.println(word5.indexOf("c",5)); // 8
    }
    
    public static String recombine(String iS1, String iS2)
    {
	return iS1.substring(0,iS1.length()/2) + iS2.substring(iS2.length()/2); 
    }
    
}
