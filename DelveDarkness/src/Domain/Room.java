package Domain;

public class Room implements IDescription
{
	private Exit[] roomExits;
	private String description;
	private Puzzle puzzle;
	private Trap trap;
	
	
	public Room()
	{
		
	}


	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return description;
	}
}
