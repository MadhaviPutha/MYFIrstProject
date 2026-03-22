package MyPackage;

public class B {
	static int eid = 100;
	int eid2 = 200;
	static {
		eid=555;
		System.out.println("static block " + eid);
	}

	{
		eid2=333;
		System.out.println("instance block " + eid2);
	}
	{
		eid2=444;
		System.out.println("instance block " + eid2);
	}
	void disp() {
		System.out.println("instance method instance var: " + eid2);
		System.out.println("instance method static var: " + B.eid);

	}

	static void disp1() {
		System.out.println("static method static value " + eid);
		B b1 = new B();
		System.out.println("static method instance var: " + b1.eid2);
	}

	public static void main(String[] args) {
		B b = new B();
		b.disp();
		b.disp1();
	}
}
