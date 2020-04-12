package Domain;


public class Item implements IDescription
{
	private String name;
	private String description;
	private int pointValue;
	private boolean isKey;
	private ItemClass itemClass;
	
	
	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return description;
	}
	
}
