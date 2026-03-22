package MyPackage;

public class MethodOverloading {

	void m1(int a) {
		System.out.println("m1 method");
	}

	void m1(int z, int i) {
		System.out.println("m2 method");
	}
	void m1(String s,char x)
	{
		System.out.println("new method");
	}

	void m1(char c) {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.m1(10);
		mo.m1(10, 20);
		mo.m1(30, 'c');
		mo.m1('a', 30);
		mo.m1('x');
		mo.m1("Madhavi",'c');
		//mo.m1('c',"Madhavi");
	}
}
