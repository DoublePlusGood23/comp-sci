/*
  Ethan R. Jones
  10/13/15
  commonTwo - CodingBat
*/

public int commonTwo(String[] a, String[] b)
{
    int count = 0;

    for(int aLCV =0; aLCV < a.length; aLCV++)
	{
	    if(aLCV > 0 && a[aLCV].equals(a[aLCV - 1]) )
		{
		    continue;
		}

	    String key = a[aLCV];

	    for(int bLCV = 0; bLCV < b.length; bLCV++)
		{
		    if(key.compareTo(b[bLCV]) == 0)
			{
			    count++;
			    break;
			}
		}
	}
    return count;
}
