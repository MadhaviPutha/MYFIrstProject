package MyPackage;

public class Constructor1 {
	Constructor1()
	{
		this(200);
		System.out.println("0 arg const");}
	Constructor1(int a)
	{
		this(300,400);
		System.out.println("1 arg const");
	}
	Constructor1(int a,int b)
	{System.out.println("2 arg const");
	}
	void disp()
	{
		System.out.println("method ");
	}
	public static void main(String[] args) {
		Constructor1 c1=new Constructor1();
		//Constructor1 c=new Constructor1(12);
		//Constructor1 c2=new Constructor1(10,20);
			//	c.disp();
			//c1.disp();
			//	c2.disp();
		
	}

}
