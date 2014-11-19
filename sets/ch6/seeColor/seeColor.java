public String seeColor(String str)
{
    if(str.length() <= 2)
	{
	    return "";
	}
    else if(str.substring(0,3).equals("red"))
	{
	    return "red";
	}
    else if(str.length() <= 3)
	{
	    return "";
	}
    else if(str.substring(0,4).equals("blue"))
	{
	    return "blue";
	}
    return "";
}
