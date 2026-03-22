package Practise;

public class Construct1 {
	int sid;
	String sname;

	Construct1(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	Construct1(Construct1 c2)
	{
		this.sid=c2.sid;this.sname=c2.sname;
	}

	void disp() {
		System.out.println("Student id is: " + sid);
		System.out.println("Student name is: " + sname);
	}

	public static void main(String[] args) {
		Construct1 c = new Construct1(101, "Madhavi");
		Construct1 c2 = new Construct1(c);
		c2.disp();
	}

}
