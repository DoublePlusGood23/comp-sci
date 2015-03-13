/*
  Ethan R. Jones
  3/13/15
  userCompare CodingBat
*/
public int userCompare(String aName, int aId, String bName, int bId)
{

    if(aName.compareTo(bName) < 0 || (bId > aId && aName.compareTo(bName) == 0))
	{
	    // a is bigger
	    return -1;
	}
    else if(aName.compareTo(bName) > 0 || aId > bId)
	{
	    // b is bigger
	    return 1;
	}
    else if(aName.compareTo(bName) == 0)
	{
	    return 0;
	}
    return 0;
}
