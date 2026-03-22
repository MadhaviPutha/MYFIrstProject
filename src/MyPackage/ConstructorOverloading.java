package MyPackage;

public class ConstructorOverloading {
	ConstructorOverloading() {
	}

	ConstructorOverloading(int x) {
		System.out.println("const overloading 1");
	}

	ConstructorOverloading(char z) {
		System.out.println("const overloading 2");
	}

	void disp() {
		System.out.println(10 + 20);
		System.out.println("madhavi " + "latha" + 20);
		System.out.println(10 + "madhavi" + 'n');
	}

	public static void main(String[] args) {

		new ConstructorOverloading(10);
		new ConstructorOverloading('c');
		ConstructorOverloading c = new ConstructorOverloading();
		c.disp();

	}

}
