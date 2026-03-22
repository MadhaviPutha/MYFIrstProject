package Practise;

public class TesterTest {

	int b = 20;

	void m1(int a) {
		System.out.println("local variable: " + a);
		System.out.println("instance variable calling from instance method: " +b);
	}

	static void m2(int s) {
		TesterTest test = new TesterTest();
		int d = test.b;
		System.out.println("instance variable calling from static method: " + d);
	}
m3()
{
	System.out.println("method");
}
	public static void main(String[] args) {
		int e;
		System.out.println(e);
		TesterTest test = new TesterTest();
		test.m1(10);
		int c = test.b;
		System.out.println("instance variable: " + c);
		TesterTest.m2(0);
	}

}
