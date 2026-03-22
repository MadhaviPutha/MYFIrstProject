package MyPackage;
import java.lang.*;

public class A {
	static
	{
		System.out.println("Static Block A");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		try
		{
		Class classlldr = Class.forName("java.lang.ClassLoader");
		System.out.println("Name of Class  = " + classlldr.getName());//get the name of class  
        System.out.println("Package Name  = " + classlldr.getPackage());//get the package         System.out.println("Interface Name  = " + classlldr.getInterfaces());//get the Interface  
        System.out.println("Construcors     = " + classlldr.getConstructors());//get the constructor   
        System.out.println("Classes        = " + classlldr.getClasses());//get the class  
     } catch(ClassNotFoundException ex) {  
        System.out.println(ex.toString());//print  exception object  
		
     }}
}
