package Project;

import java.util.Scanner;

public class Consumer {
	

	public static void main(String[] args) {
		
		Student student = new Student();
		Teacher teac = new Teacher();
		Admin adm = new Admin();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Command Type:");
		char cmd = scan.next().charAt(0);

		System.out.println("Enter Person Type :");
		char per = scan.next().charAt(0);

		System.out.println("Enter Name of the Person :");
		String name = scan.next();

		System.out.println("Enter Gender :");
		char gen = scan.next().charAt(0);

		System.out.println("Enter Grade :");
		int grade = scan.nextInt();

		//Consumer con = new Consumer();
		  
		student.Add(cmd, per, name, gen, grade);
		student.Update(cmd, per, name, gen, grade);
		student.Delete(cmd, per, name, gen, grade);
		
		scan.close();
	}

}
