package Project;

import java.util.Scanner;

public class Implement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Members Member[] = new Members[2];

		for (int i = 0; i < Member.length; i++) {
			System.out.println("Enter Command Type:");
			char cmd = scan.next().charAt(0);

			System.out.println("Enter Person Type :");
			char per = scan.next().charAt(0);

			System.out.println("Enter Name of the Person :");
			String name = scan.next();

			System.out.println("Enter Gender :");
			char gen = scan.next().charAt(0);

			Member[i] = new Members();
			Member[i].cmd = cmd;
			Member[i].per = per;
			Member[i].gen = gen;
			Member[i].name = name;
			System.out.println(Member[i].cmd + ":" + Member[i].per + ":" + Member[i].gen + ":" + Member[i].name);
		}

		/*
		 * for (int i = 0; i < Member.length; i++) {
		 * System.out.println(Member[i].cmd + ":" + Member[i].per + ":" +
		 * Member[i].gen + ":" + Member[i].name); }
		 */
	}

}

class Members {
	char cmd;
	char per;
	char gen;
	String name;
}
