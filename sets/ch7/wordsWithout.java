/*
  Ethan R. Jones
  12/18/14
  Words without
*/
public String[] wordsWithout(String[] words, String target)
{
    int stringSize = 0;
    int n = 0;
    for(int x = 0; x < words.length; x++)
	{
	    if(words[x] != target)
		{
		    stringSize++;
		}
	}
    String[] newWords = new String[stringSize];
    for(int x = 0; x < words.length; x++)
	{
	    if(words[x] != target)
		{
		    newWords[n] = words[x];
		    n++;
		}
	}
    return newWords;   
}

