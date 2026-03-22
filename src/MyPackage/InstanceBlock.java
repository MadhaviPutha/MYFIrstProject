package MyPackage;

public class InstanceBlock {
int eid;
	{
		eid=100;
	}
	
	void disp()
	{ 
		System.out.println(eid);
	}
	InstanceBlock()
	{
		System.out.println("0 arg const");
	}
	
	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock();
		ib.disp();
		
		
	}

}
