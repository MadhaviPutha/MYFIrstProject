package Practise;

public class InstLocalVar {

	int a=100;
	int m1()
	{
		System.out.println("Return instance variable"); // as there is no local var
		return a;	
	}
	int m2(int a)
	{
		System.out.println("Returns local variable"); // when local n instance have same var name, priority goes to local var
		return a;	
	}
	int m3(int a)
	{
		System.out.println("when local n instance have same var name and you want to give priority to instance variable");
		return this.a;	
	}
	public static void main(String[] args) 
	{
		InstLocalVar ilv = new InstLocalVar();
		int x = ilv.m1();
		System.out.println(x);
		int x1 = ilv.m2(20);
		System.out.println(x1);
		int x2 = ilv.m3(10);
		System.out.println(x2);
	}
	
}
