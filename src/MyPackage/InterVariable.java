package MyPackage;

interface inf {
	int a=100;
	void m1();
}
interface inf2{
	int a=10;
}

public class InterVariable implements inf,inf2{
	public void m1(){
		System.out.println(inf.a);
		System.out.println(inf2.a);
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		InterVariable intvar = new InterVariable();
		intvar.m1();
		
		
	}

}
