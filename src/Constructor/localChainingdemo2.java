package Constructor;


//this() transfers the control to another constructor present in the class and the statements 
//in the other constructor is executed.
//After this control is given back to the constructor containing the this() method and the statements present
//after the this() method is executed.
//Control goes back to the object creation where reference is created to the object call


class Customerdemo
{
	private int Cid;
	private String Cname;
	private long Cphone;

	Customerdemo()
	{
		Cid = 1;
		Cname = "arul";
		Cphone = 9816131l;
	}

	Customerdemo(int Cid, String Cname,long Cphone){
		this();
		this.Cid = Cid;
		this.Cname = Cname;
		this.Cphone = Cphone;
	}

	public int getCid() {
		return Cid;
	}

	public String getCname() {
		return Cname;
	}

	public long getCphone() {
		return Cphone;
	}
}

public class localChainingdemo2 {

	public static void main(String[] args) {
		Customerdemo c1 = new Customerdemo(2,"alex",173381l);
		System.out.println(c1.getCid());
		System.out.println(c1.getCname());
		System.out.println(c1.getCphone());
	}
}
