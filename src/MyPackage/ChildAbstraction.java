package MyPackage;

abstract class ParentAbstraction {

	ParentAbstraction() {
		System.out.println("Parent Constructor");
	}

	abstract void m1();

	abstract void m2();

	abstract void m3();

	void m4() {
		System.out.println("m4 method");
	}

	{
		System.out.println("Parent Instance block");
	}
	
	static {
		System.out.println("Parent Static block");
	}
}

public class ChildAbstraction extends ParentAbstraction {

	ChildAbstraction() {
		// super();
		System.out.println("Child Constructor");
	}

	{
		System.out.println("Child Instance block");
	}
	
	static {
		System.out.println("Child Static block");
	}
	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {

		// Parent class reference to parent object
		// ParentAbstraction p = new ParentAbstraction(); // Cannot instantiate
		// the type ParentAbstraction

		// child class reference to child object
		ChildAbstraction t = new ChildAbstraction();
		t.m1();
		t.m2();
		t.m3();
		t.m4();

		System.out.println("                ");
		// Parent class reference to child object
		ParentAbstraction p = new ChildAbstraction();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
	}

}
