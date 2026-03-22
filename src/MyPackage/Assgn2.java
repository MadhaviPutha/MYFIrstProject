package MyPackage;

public class Assgn2 {

int a,b;
static int c=300;
static int d=400;
void m1()
{ 
	System.out.println(a);
	System.out.println(b);
	System.out.println(Assgn2.c);
	System.out.println(Assgn2.d);
}
static void m2()
{ 
	Assgn2 t=new Assgn2();
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(c);
	System.out.println(d);
}
static void m3()
{ 
	Assgn2 t=new Assgn2();  // same object can be created as the object is destroyed in prev me
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(c);
	System.out.println(d);
}
public static void main(String[] args) {

	Assgn2 m=new Assgn2();
		m.m1();
		m2();  // directly
		//m.m2(); // with object name 
		// Warning (The static method m2() from the type Assgn2 should be accessed in a static way)
		Assgn2.m2(); // using class name
		Assgn2.m3(); // using class name
	}
}
