package MyPackage;

interface intf1{
	interface intf2{
	void m1();
	}
}

public class InterfNested1 implements intf1.intf2{
	public void m1(){
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		InterfNested1 in = new InterfNested1();
		in.m1();
	}

}
