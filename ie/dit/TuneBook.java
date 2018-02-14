package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<Tune> tunes = new ArrayList<Tune>();
	
	public TuneBook(String file)
	{
		//String file = "hnj0.abc";
		
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
	public String toString()
	{
		String s = "";
		for(String tune:tunes)
		{	
			s += tune.x + "\n " + tune.title + "\n " + tune.altTitle + "\n" + tune.notation + "\n";
		}
		return s;
	}
	public Tune findTune(String title)
	{
		String search = "":
		for (String tune:tunes)
		{
			if(boolean contains(title) == true)
			{
				System.out.println(tune);
			}
			else
			{
				System.out.println("Song not found\n");
			}
		}
	}
	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
		
}