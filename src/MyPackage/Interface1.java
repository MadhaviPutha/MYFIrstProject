package MyPackage;

interface It1 {
	void m1(); // by default interface methods are public and abstract
	void m2();
	void m3();
}

public class Interface1 implements It1 {
	public void m1() { // if we dont declare it as public it throws error 'Cannot
				// reduce the visibility of the inherited method from It1' as class methods are by default - default
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		Interface1 it = new Interface1();
		it.m1();
		it.m2();
		it.m3();
		It1 i = new Interface1();
		i.m1();
		i.m2();
		i.m3();
	}

}
