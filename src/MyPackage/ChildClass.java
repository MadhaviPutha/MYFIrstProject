package MyPackage;

class parentclass {

	public void m1() {
		System.out.println("parent class public method");
	}

	protected void m2() {
		System.out.println("parent class protected method");
	}

	private void m3() {
		System.out.println("parent class private method");
	}

	void m4() {
		System.out.println("parent class method");
	}

	static void m5() {
		System.out.println("parent class static method");
	}
}

public class ChildClass extends parentclass {

	public void m1() {
		System.out.println("child class public method");
	}

	protected void m2() {
		System.out.println("child class protected method");
	}

	private void m3() {
		System.out.println("child class private method");
	}

	void m4() {
		System.out.println("child class method");
	}

	static void m5() {
		System.out.println("child class static method");
	}

	public static void main(String[] args) {
		ChildClass pre = new ChildClass();
		pre.m1();
		pre.m2();
		pre.m3();
		pre.m4();
		pre.m5();

		parentclass preref = new parentclass();
		preref.m1();
		preref.m2();
		// preref.m3();
		preref.m4();
		preref.m5();

		parentclass pareref = new ChildClass();
		pareref.m1();
		pareref.m2();
		// pareref.m3();
		pareref.m4();
		pareref.m5(); // child class object is created and assigned to parent class reference.
	}

}
