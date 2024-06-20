package deadlock;
//deadlock is a state when two or more processes are waiting for the resource being held
//by another process and neither processes are willing to release the resource.

/*
Rohith and suresh want both resources controller and playstation but rohith first takes the
playstaion , locks it and waits for controlleer 
Similarly, Suresh takes first takes controller, locks it and waits for playstation
both aree waiting for a resource being locked and held by another resource
this causes deadlock*/


class demo1 implements Runnable
{
	String res1 = "PlayStation";
	String res2 = "Controller";
	@Override
	public void run() {

		if(Thread.currentThread().getName().equals("Rohith")) {
			rohith();
		}
		else {
			Suresh();
		}

	}

	void rohith()
	{	
		try 
		{
			synchronized (res1) {
				System.out.println("Rohith acc playstation");
				Thread.sleep(1000);


				synchronized (res2) {
					System.out.println("Rohith acc controller");
					Thread.sleep(1000);

				}

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	void Suresh() {

		try 
		{
			synchronized (res2) {
				System.out.println("Suresh acc controller");
				Thread.sleep(1000);


				synchronized (res1) {
					System.out.println("Suresh acc Playstation");
					Thread.sleep(1000);

				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}





public class demo1deadlock {

	public static void main(String[] args) {
		demo1 d = new demo1();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.setName("Rohith");
		t2.setName("Suresh");

		t1.start();
		t2.start();

	}
}	