package MyPackage;

class Y {
	interface intclass{
		void m1();
	}
}

public class InterfNestClass implements Y.intclass{  //Map.entry is same as A.It2 above. Map is the main interface whereas entry is the sub-interface. 

	public void m1(){
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		InterfNestClass inc = new InterfNestClass();
		inc.m1();
	}
}
