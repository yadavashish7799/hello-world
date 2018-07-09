package ashish;

class Processor extends Thread
{
	public void run()
	{
		while(true)
		{
				  System.out.println("hello");
				  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
	}
}
	public class App
	{ 
		public static void main (String[] args)
		{
			Processor p1 = new Processor();
			p1.start();		
		}
	}
	

