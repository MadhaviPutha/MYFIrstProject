package MyPackage;

class parent2 {
	int a = 10, b = 20;
	static int c = 30, d = 40;

	void m1() {
		System.out.println("parent instance method");
	}

	static void m3() {
		System.out.println("parent static method");
	}

	parent2() {
		System.out.println("parent constructor");
	}
}

class Inherit1 extends parent2 {
	int a = 100, b = 200;
	static int c = 300, d = 400;

	void m1() {
		System.out.println("child instance method");
	}

	static void m3() {
		parent2.m3();
		System.out.println("child static method");
	}

	void m2() {
		this.m1();
		super.m1();
	}

	Inherit1() {
		this(20);
		System.out.println("child1 constructor");
	}

	Inherit1(int s) {
		super();
		System.out.println("child2 constructor");
	}

	void add(int a, int b) {
		System.out.println(a + b); // local
		System.out.println(this.a + this.b); // current
		System.out.println(super.a + super.b); // parent
	}

	public static void main(String[] args) {
		Inherit1 in = new Inherit1();
		in.add(1000, 2000);
		in.m2();
		Inherit1 in1 = new Inherit1(10);
		in1.m1();
		Inherit1.m3();
	}
}
