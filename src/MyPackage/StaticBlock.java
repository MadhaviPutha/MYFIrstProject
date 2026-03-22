package MyPackage;

public class StaticBlock {
	static
	{
		System.out.println("Static Block1");
	}
	static
	{
		System.out.println("Static Block2");
	}
	{
		System.out.println("Instance Block1");
	}

	StaticBlock()
	{
		System.out.println("0 arg cons");
	}
	StaticBlock(int a)
	{
		System.out.println("1 arg cons");
	}
	StaticBlock(int a,int b)
	{
		System.out.println("2 arg cons");
	}
	{
		System.out.println("Instance Block2");
	}
	void m1()
	{
		
	}
	void m1(int a)
	{
		
	}
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		StaticBlock sb1 = new StaticBlock(10);
		StaticBlock sb2 = new StaticBlock(20,30);

}
	}
