package ie.dit;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX()
	{
		return x;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAltTitle()
	{
		return altTitle;
	}
	public String getNotation()
	{
		return notation;
	}
	
	public String toString()
	{
		String song = "";
		for (int i=0; i >=100;i++)
		{
			song += x + ", " + title + ", " + altTitle + "\n";
			if (altTitle == NULL)
			{
				song += x + ", " + title + "\n";
			}
			
		}
		
		
	}
	
}