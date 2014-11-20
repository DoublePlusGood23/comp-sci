public String extraFront(String str)
{
    String chars = "";
    if(str.equals("") == true)
	{
	    return "";
	}
    else if(str.length() < 2)
	{
	    chars = str.substring(0,1);
	}
    else
	{
	    chars = str.substring(0,2);
	}
    return chars + chars + chars;
}
