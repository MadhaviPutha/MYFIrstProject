package Practise;

class Emp1{};
class X{};

public class MethodVsObject {

	Emp1 m1()
	{
		System.out.println("Emp Class");
		Emp1 e = new Emp1();
		return e;
	}
	X x1()
	{
		System.out.println("X Class");
		return new X();
	}
	static String m3()
	{
		System.out.println("m3 method");
		return "khushi";
	}
	public static void main(String[] args) {
		MethodVsObject mvo = new MethodVsObject();
		Emp1 e = mvo.m1();
		System.out.println(e);
		X x = mvo.x1();
		System.out.println(x);
		String str = MethodVsObject.m3();
		System.out.println(str);
	}
}
