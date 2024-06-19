package Daemon;


class demo extends Thread
{
	@Override
	public void run()
	{
		if(Thread.currentThread().getName().equals("TYPING"))
				{
			type();
		}
		else if(Thread.currentThread().getName().equals("SPELLCHECK"))
		{
			spellcheck();
		}
		else
		{
			autosave();
		}
	}
	
	
	void type(){
		
		for(int i = 1 ; i<=5; i++)
		{
			try
			{
				System.out.println("User is typing in MSWord");
				Thread.sleep(1000);
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	void spellcheck()
	{
		for(;;)
		{
			try
			{
				System.out.println("MSWord is checking the spelling");
				Thread.sleep(1000);
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	void autosave()
	{
		for(;;)
		{
			try
			{
				System.out.println("MSWord is autosaving");
				Thread.sleep(1000);
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
}


public class coach {

	public static void main(String[] args) {
		demo d1 = new demo();
		demo d2 = new demo();
		demo d3 = new demo();
		
		d1.setName("TYPING");
		d2.setName("SPELLCHECK");
		d3.setName("AUTOSAVE");
		
		d2.setDaemon(true);
		d3.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();

	}

}
