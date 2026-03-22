package MyPackage;

class parentt extends Object {
	parentt() {
		System.out.println("parent class 1 arg");
	}
}

public class InheritSuper extends parentt {
	InheritSuper() {
		System.out.println("child class 0 arg");
	}

	InheritSuper(int a) {
		System.out.println("child class 1 arg");
	}

	InheritSuper(int a, int b) {
		System.out.println("child class 1 arg");
	}

	public static void main(String[] args) {
		new InheritSuper();
		new InheritSuper(20);
		new InheritSuper(20, 30);
	}
}
