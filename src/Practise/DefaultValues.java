package Practise;

public class DefaultValues {

	static int a; byte b; long l; short s;
	float f; String str; boolean bl;
	
void m1()
{
	int x;
}
	
	public static void main(String[] args) {
		DefaultValues df = new DefaultValues();
		System.out.println(DefaultValues.a);
		System.out.println(df.b);
		System.out.println(df.s);
		System.out.println(df.f);
		System.out.println(df.str);
		System.out.println(df.bl);
		System.out.println(df.l);
		df.m1();
		
	}

}
