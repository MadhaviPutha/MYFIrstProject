package Practise;

public class obj {
	obj m1()
	{ System.out.println("m1 method");
	obj t = new obj();
	return t;
	}
	obj m2()
	{ System.out.println("m2 method");
	return this;
	}
	public static void main(String[] args)
	{ obj t = new obj();
	 t.m1();
	 t.m2();
	}}