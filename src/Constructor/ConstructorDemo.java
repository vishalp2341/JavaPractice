package Constructor;

/*a demo of zero parameter constructor and constructor of 3 parameters*/

class Demo
{
	private int Cid;
	private String Cname;
	private int Cno;
	
public Demo() {
		Cid = 1;
		Cname = "vishal";
		Cno = 9875322;
	}
	


	public Demo(int cid, String cname, int cno) {
	
	this.Cid = cid;
	this.Cname = cname;
	this.Cno = cno;
}



	public int getCid() {
		return Cid;
	}
	public String getCname() {
		return Cname;
	}
	public int getCno() {
		return Cno;
	}
}




public class ConstructorDemo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		System.out.println(d1.getCid());
		System.out.println(d1.getCname());
		System.out.println(d1.getCno());
		
		
		Demo d2 = new Demo(2,"yoyo", 17813);
		System.out.println(d2.getCid());
		System.out.println(d2.getCname());
		System.out.println(d2.getCno());

	}

}
