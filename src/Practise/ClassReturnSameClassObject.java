package Practise;

public class ClassReturnSameClassObject {

	ClassReturnSameClassObject c1() {
		System.out.println("c1 method");
		ClassReturnSameClassObject cr = new ClassReturnSameClassObject();
		return cr;
	}

	ClassReturnSameClassObject c2() {
		System.out.println("c2 method");
		return this;
	}

	public static void main(String[] args) {
		ClassReturnSameClassObject c = new ClassReturnSameClassObject();
		ClassReturnSameClassObject t2 = c.c1();
		System.out.println(t2);
		ClassReturnSameClassObject t3 = c.c2();
		System.out.println(t3);
	}
}
