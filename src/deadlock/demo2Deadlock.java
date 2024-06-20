package deadlock;
//deadlock is a state when two or more processes are waiting for the resource being held
//by another process and neither processes are willing to release the resource.

/*
Rohith and suresh take turns to prevent deadlock
each of them access res 1 and res 2 completely and the other person waits
and vice versa*/


class demo2 implements Runnable
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
			synchronized (res1) {
				System.out.println("Suresh acc playstaion");
				Thread.sleep(1000);


				synchronized (res2) {
					System.out.println("Suresh acc controller");
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





public class demo2Deadlock {

	public static void main(String[] args) {
		demo2 d = new demo2();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.setName("Rohith");
		t2.setName("Suresh");

		t1.start();
		t2.start();

	}
}	