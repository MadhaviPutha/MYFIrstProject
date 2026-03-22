package Practise;

public class MethodVsPrimitive {

	int m1()
	{
		System.out.println("m1 method");
		return 10;
	}
	float m2()
	{
		System.out.println("m2 method");
		return 10.3f;
	}
	static char m3()
	{
		System.out.println("m3 method");
		return 'a';
	}
	
	public static void main(String[] args) {
		MethodVsPrimitive mvp = new MethodVsPrimitive();
		int a = mvp.m1();
		System.out.println(a);
		float f = mvp.m2();
		System.out.println(f);
		System.out.println(MethodVsPrimitive.m3());
	}

}
