package ProducerConsumer;

//correct implentation of producer consumer problem

class queue1{
	
	private int x;
	boolean is_data_present = false;

	synchronized void store(int x)
	{	if(is_data_present==false)
	{
		this.x=x;
		System.out.println("produced  "+x);
		is_data_present = true;
		notify();		
	}
	else
	{
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
	synchronized void retrieve()
	{	if(is_data_present==true)
	{
		System.out.println("consumed  "+x);
		is_data_present = false;
		notify();		
	}
	else
	{
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
}



class producer1 extends Thread
{
	queue1 a;
	
	producer1(queue1 q)
	{
		a=q;
	}
	
	public void run() {
		int i = 1;
		for(;;)
		{
			a.store(i++);
		}
	}
}


class consumer1 extends Thread
{
	queue1 b;
	consumer1(queue1 q)
	{
		b=q;
	}
	
	public void run() {
		
		for(;;)
		{
			b.retrieve();
		}
	}
}



public class correctConsumerProducer {

	public static void main(String[] args) {
		queue1 q = new queue1();
		producer1 p = new producer1(q);
		consumer1 c = new consumer1(q);
		
		p.start();
		c.start();

	}

}
