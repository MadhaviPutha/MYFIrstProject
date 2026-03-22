package MyPackage;

public class Emp {

	Emp() {
		System.out.println("o arg const");
	}

	Emp(int a) {
		System.out.println("1 arg const");
	}

	Emp(int a, int b) {
		System.out.println("2 arg const");
	}

	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp(10);
		Emp e3 = new Emp(20,30);
		new Emp();
		new Emp(20);
		new Emp(30,40);
	}
}
