package MyPackage;

class Animal {
}

class Dog extends Animal {
}

class parents {
	int m = 20;

	void a1() {
		m = m + 10;
		System.out.println(m);
	}

	Animal marry() {
		System.out.println("black girl");
		Animal b = new Animal();
		return b;
	}

	float m1() {
		System.out.println("parent method");
		return 10.2f;
	}
}

class Overriding1 extends parents {
	Dog marry() {
		System.out.println("red girl");
		return new Dog();
	}

	float m1() {
		System.out.println("child method");
		return 20.2f;
	}

	public static void main(String[] args) {

		/*
		 * Overriding1 or = new Overriding1(); or.m1();
		 */
		new Overriding1().m1();
		new Overriding1().marry();
	}

}
