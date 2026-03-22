package MyPackage;

interface it3{
	void b1();
	void b2();
	void b3();
}

class X implements it3{
	public void b1(){		// adaptor class - interface methods having empty implementations 
	}
	public void b2(){
	}
	public void b3(){
	}
}

class Tester implements it3{
	public void b1(){
		System.out.println("implemented class method 1");
	}
	public void b2(){
		System.out.println("implemented class method 2");
	}
	public void b3(){
		System.out.println("implemented class method 3");
	}
}

public class InterfaceAdaptor extends X {

	public void b1(){
		System.out.println("adaptor class method 1");
	}
	public static void main(String[] args) {
		InterfaceAdaptor ia = new InterfaceAdaptor();
		ia.b1();
		ia.b2();
	}

}
