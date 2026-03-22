package MyPackage;

class parent1 {
	int a = 10, b = 20;
}

class Inheritance extends parent1 {
	int x = 100, y = 200;

	void add(int i, int j) {
		System.out.println(i + j); // local
		System.out.println(x + y); // current
		System.out.println(a + b); // parent
	}

	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		in.add(1000, 2000);
	}

}
