/*
  Ethan R. Jones
  12/16/14
  Linear Line
*/
public boolean linearIn(int[] outer, int[] inner)
{
    int numFound = 0;
    if(inner.length == 0)
	{
	    return true;
	}

    int q = 0;
    for(int x = 0; x < outer.length; x++)
	{
	    if(outer[x] == inner[q])
		{
		    numFound++;
		    q++;
		}
	    else if(outer[x] > inner[q])
		{
		    return false;
		}

	    if(numFound == inner.length)
		return true;
	}

    return false;
}
