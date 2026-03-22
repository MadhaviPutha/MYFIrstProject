package MyPackage;

public class Constructorr {
	int a=200;
	int def1;
	String def2;
	char def3;
	double def4;
	float def5;
	boolean def6;
	
	void disp()
	{
		System.out.println("Display variables: " + def1 + ","+ def2 + ","+ def3 + "," + def4 + ","+ def5 + "," + def6);
	}
	void m1()
	{
		System.out.println("Method");
	}
	Constructorr(int def1,String def2,char def3,double def4,float def5,boolean def6)
	{
		 def1=10;
		 def2="Madhavi";
		 def3='M';
		 def4=12.34;
		 def5=134.23f;
		 def6=true;
	}
	void dispp(){
		System.out.println("Display dispp variables: " + def1 + ","+ def2 + ","+ def3 + "," + def4 + ","+ def5 + "," + def6);
		
	}
	Constructorr()
	{
		System.out.println("0 arg const");
	}
	Constructorr(int a)
	{
		System.out.println("instance variable value " + this.a);
		this.a=a; // initialize instance variables
		System.out.println("1 arg const " + this.a);
		
	}
	Constructorr(String str,String str1)
	{
		System.out.println("2 arg const " + str + "," + str1);
	}
	public static void main(String[] args) {
		Constructorr cons=new Constructorr();
		//cons.m1();
		//cons.disp();
		cons.dispp();
		Constructorr cons1=new Constructorr(100);
		//Constructorr cons2=new Constructorr("mad","raj");
		//Constructorr cons2=new Constructorr("mad","raj");
	}
}
