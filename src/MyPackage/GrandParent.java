package MyPackage;

class Child {
	void m1() {
		System.out.println("Grandparent method1");
	}

	void m2() {
		System.out.println("Grandparent method2");
	}
}

class Parent extends Child {
	void m3() {
		System.out.println("Parent method1");
	}

	void m4() {
		System.out.println("Parent method2");
	}
}

class GrandParent extends Parent {
	void m5() {
		System.out.println("Child method1");
	}

	void m6() {
		System.out.println("Child method2");
	}

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		gp.m1();
		gp.m2();
		gp.m3();
		gp.m4();
		gp.m5();
		gp.m6();
		/*
		 * Parent p = new Parent(); 
		 * p.m3(); p.m4(); 
		 * Child c = new Child();
		 * c.m1(); c.m2();
		 */

	}
}
