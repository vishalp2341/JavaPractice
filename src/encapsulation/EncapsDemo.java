package encapsulation;

//friend is accessing your usn and pwd, and changing it. This can be prevented by using private keyword in class you
//or by using setters and getters
//this is known as 'Encapsulation'
class you
{
	int usn = 12345;
	int pwd = 11111;
	
}

class friend
{ 
	you u = new you();
	
	void display()	
	{ 	
		System.out.println(u.usn);
		System.out.println(u.pwd);
		
	}
	
	
	void change()
	{
		u.pwd = 22222;
		System.out.println("changed");
	}
}

public class EncapsDemo {
public static void main(String[] args) {
	friend f = new friend();
	f.display();
	f.change();
	f.display();
	
}

}
