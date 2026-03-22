package Practise;

public class Student 
	{ //instance variables
	int sid;
	String sname;
	int smarks;
	//constructor assigning values to instance variables
	Student(int sid,String sname,int smarks)
	{ this.sid=sid;
	this.sname=sname;
	this.smarks=smarks;
	}
	//method assigning values to instance variables
	void assign(int sid,String sname,int smarks)
	{ this.sid=sid;
	this.sname=sname;
	this.smarks=smarks;
	}
	void disp()
	{ System.out.println("****student Details****");
	System.out.println("student name = "+sname);
	System.out.println("student id = "+sid);
	System.out.println("student mrks = "+smarks);
	}
	public static void main(String[] args)
	{ Student s = new Student(111,"ratan",100);
	s.disp();
	s.assign(222,"anu",200);
	s.disp();
	}
	}

