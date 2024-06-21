package ProducerConsumer;

//wrong implentation of producer consumer as producing and consuming is not turn by turn and occurs randomly

class queue{
	
	private int x;

	void store(int x)
	{
		this.x=x;
		System.out.println("produced  "+x);
	}
	
	void retrieve()
	{
		System.out.println("consumed  "+x);
	}
}



class producer extends Thread
{
	queue a;
	
	producer(queue q)
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


class consumer extends Thread
{
	queue b;
	consumer(queue q)
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



public class ProducerConsumerproblem {

	public static void main(String[] args) {
		queue q = new queue();
		producer p = new producer(q);
		consumer c = new consumer(q);
		
		p.start();
		c.start();

	}

}
