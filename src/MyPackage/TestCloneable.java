package MyPackage;

class TestCloneable implements Cloneable {
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws Exception {
		TestCloneable tc = new TestCloneable();
		System.out.println(tc.a);
		System.out.println(tc.b);
		tc.a = 100;
		tc.b = 200;
		System.out.println(tc.a);
		System.out.println(tc.b);
		tc.a = 111;
		tc.b = 222;
		TestCloneable tc1 = (TestCloneable) tc.clone();
		tc.a = 1000;
		tc.b = 2000;
		System.out.println(tc.a);
		System.out.println(tc.b);
		System.out.println(tc1.a);
		System.out.println(tc1.b);
	}
}
