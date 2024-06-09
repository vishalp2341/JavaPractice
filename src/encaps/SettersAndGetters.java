package encaps;

class Car
{
	private int Mileage;
	private String Name;
	private String Fuel;
	
	
	void setData(int Mileage, String Name, String Fuel)
	{
		this.Mileage = Mileage;
		this.Name=Name;
		this.Fuel=Fuel;
				
	}
	
	
	int getMileage()
	{
		return Mileage;
	}
	
	String getName()
	{
		return Name;
	}
	
	String getFuel()
	{
		return Fuel;
	}
}


public class SettersAndGetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println("before setting");
		System.out.println(+c.getMileage()+"   "+c.getName()+"   "+c.getFuel());
		System.out.println();
		c.setData(20,"Hyundai","Petrol");
		System.out.println("after setting");
		System.out.println(+c.getMileage()+"   "+c.getName()+"   "+c.getFuel());

	}

}
