package MyPackage;

class parentref {
	void a1() {
		System.out.println("parent");
	}

	void a2() {
		System.out.println("static parent1");
	}

	void a3() {
		System.out.println("instance method parent");
	}

	final void a4() {
		System.out.println("final parent");
	}
}

public class ParentReference extends parentref {

	void a1() {
		System.out.println("child");
	}

	void m3(){
		super.a1();
	}
	void a2() {

		System.out.println("static child1");
	}

	void a3() {
		System.out.println("instance method child");
	}

	public static void main(String[] args) {
		parentref p2 = new ParentReference(); // child class object is created
												// and assigned to parent class
												// reference.
		p2.a1();
		p2.a2(); // static methods are specific to class but not to object.
		p2.a4();

		// p2.a3();
		// new ParentReference().a2(); // static methods are specific to class
		// but not to object.

		parentref p4 = new parentref();
		p4.a1();

		ParentReference p1 = new ParentReference();
		p1.a2();
		p1.a3();
		// p1.a3();
		p1.a4();

		parentref p3 = new parentref();
		// p3.a3();

		/*
		 * parentref p = new parentref(); parentref p1 = new ParentReference();
		 * ParentReference p2= new ParentReference(); ParentReference p3= new
		 * parentref();
		 */
	}
}
