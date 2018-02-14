package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<Tune> tunes = new ArrayList<Tune>();
	
	public TuneBook(String file)
	{
		String file = "hnj0.abc";
		
		BufferedReader inputStream = null;
		
		try 
		{
			inputStream = new BufferedReader(new FileReader(file));
    
			String l;
			while ((l = inputStream.readLine()) != null) 
			{
				//Tune tune = new Tune(1);
				tunes.add(1);
				System.out.println(l);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			if (inputStream != null) 
			{
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}    
	}
		//loadTuneBook();
	}
	
	public void loadTuneBook()
	{
		
}