package deadlock;
//deadlock is a state when two or more processes are waiting for the resource being held
//by another process and neither processes are willing to release the resource.

/*
if we use non constant pool for creating string resources like below,
 where duplicates are allowed , there is no deadlock as each person gets 
 their own resource pool*/


class demo3 implements Runnable
{
	String res1 = new String("PlayStation");
	String res2 = new String("Controller");
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
				System.out.println("Suresh acc playstation");
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





public class NonConstantPool {

	public static void main(String[] args) {
		demo3 d = new demo3();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.setName("Rohith");
		t2.setName("Suresh");

		t1.start();
		t2.start();

	}
}	