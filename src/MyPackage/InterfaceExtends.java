package MyPackage;

interface it2 {
	void a1();
	void a2();
	void a3();
}

abstract class Test implements it2 {
	public void a1() {
		System.out.println("a1 method");
	}
}

abstract class Test1 extends Test {
	public void a2() {
		System.out.println("a2 method");
	}
}

class InterfaceExtends extends Test1 {

	public void a3() {
		System.out.println("a3 method");
	}

	public static void main(String[] args) {
		InterfaceExtends ie = new InterfaceExtends();
		ie.a1();
		ie.a2();
		ie.a3();
	}
}
