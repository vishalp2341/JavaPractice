package abstraction;



abstract class Animal
{
	abstract void eat();
	abstract void sleep();
	
}

 class Deer extends Animal
{
	void eat()
	{
		System.out.println("Deer is Eating");
	}
	
	void sleep()
	{
		System.out.println("Deer is sleeping");
	}
}
 
 class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger is Eating");
	}
	
	void sleep()
	{
		System.out.println("Tiger is sleeping");
	}
}
 
 
 class Monkey extends Animal
{
	void eat()
	{
		System.out.println("Monkey is Eating");
	}
	
	void sleep()
	{
		System.out.println("Monkey is sleeping");
	}
}

 class zoo
 {
	 static void live(Animal ref)
	 {
		 ref.eat();
		 ref.sleep();
	 }
 }
 
public class AnimalAbstractionPolyInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoo.live(new Deer());
		zoo.live(new Tiger());
		zoo.live(new Monkey());
		
	}

}
