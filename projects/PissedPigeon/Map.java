package javagame;
import java.awt.Point;

public class Map 
{
    private Actor[][] spaces = new Actor[300][100];
    public Map() 
    {
		
    }
	
    public boolean isOccupied(int x, int y)
    {
	if(spaces[x][y] == null)
	    return true;
	else
	    return false;
    }
	
    public Actor getActorAt(int x, int y)
    {
	return spaces[x][y];
    }
	
    public Point location(Actor act)
    {
	int x = 0;
	int y = 0;
		
	for(x = 0; x < spaces.length; x++)
	    for(y = 0; y < spaces[x].length; y++)
		if(spaces[x][y].equals(act))
		    break;

	return new Point(x,y);
    }

}
