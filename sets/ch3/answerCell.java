public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) 
{
    if(isAsleep == true)
	{
	    return false;
	}
    else if(isMorning == true && isMom == false)
	{
	    return false;
	}
    else
	{
	    return true;
	} 
}
