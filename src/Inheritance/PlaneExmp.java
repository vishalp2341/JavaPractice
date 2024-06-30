//demo of inherited, specialised and overriden methods

package Inheritance;
class Plane{
	void takeoff() 
	{
		System.out.println("plane is taking off");
	}
	
	void fly()
	{
		System.out.println("plane is flying");
	}
	
	void land() 
	{
		System.out.println("plane is landing");
	}
}

class cargoplane extends Plane{
	void fly() //overridden method
	{    
		System.out.println("cargo plane is flying at low height");
	}
	
	void CarryCargo() // specialised method
	{
		System.out.println("cargo plane is carrying cargo");
	}
}

class fighterplane extends Plane{
	void fly() //overridden method
	{    
		System.out.println("fighter plane is flying at high height");
	}
	
	void CarryMissiles() // specialised method
	{
		System.out.println("fighter plane is carrying missiles");
	}
}

class passengerplane extends Plane{
	void fly() //overridden method
	{    
		System.out.println("passenger plane is flying at medium height");
	}
	
	void CarryPassengers() // specialised method
	{
		System.out.println("passenger plane is carrying passengers");
	}
}

public class PlaneExmp {

	public static void main(String[] args) {
		
		cargoplane cp = new cargoplane();
		fighterplane fp = new fighterplane();
		passengerplane pp = new passengerplane();
		
		cp.takeoff();
		cp.fly();
		cp.CarryCargo();
		cp.land();
		
		System.out.println("=======================================================================");
		
		fp.takeoff();
		fp.fly();
		fp.CarryMissiles();
		fp.land();
		
		System.out.println("=======================================================================");
		
		pp.takeoff();
		pp.fly();
		pp.CarryPassengers();
		pp.land();
		

	}

}
