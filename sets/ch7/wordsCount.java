/*
  Ethan R. Jones
  12/18/14
  wordsCount
*/
public int wordsCount(String[] words, int len)
{
    int count = 0;
    for(int x = 0; x < words.length; x++)
	{
	    if(words[x].length() == len)
		{
		    count++;
		}
	}
    return count;  
}


