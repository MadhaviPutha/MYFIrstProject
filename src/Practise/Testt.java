package Practise;

public class Testt {
	{
		System.out.println("instance block-1:logics");
	}

	Testt() {
		System.out.println("0-arg constructor:logics");
	}

	{
		System.out.println("instance block-2:logics");
	}
	{
		System.out.println("instance block-3:logics");
	}
	Testt(int a) {
		System.out.println("1-arg constructor:logics");
	}

	public static void main(String[] args) {
		new Testt();
		new Testt(10);
	}
}
