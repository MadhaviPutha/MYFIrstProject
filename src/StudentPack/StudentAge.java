package StudentPack;

public class StudentAge {
	String name;
	int age;

	public int StudentsAges(String studentname, int studentage) {
		this.name = studentname;
		this.age = studentage;
		return age;
	}

	public static void main(String[] args) throws Exception {
		StudentAge stuageobj = new StudentAge();

		int[] studentsages = { stuageobj.StudentsAges("Madhavi", 10), stuageobj.StudentsAges("Madhu", 20),
				stuageobj.StudentsAges("Raji", 40),stuageobj.StudentsAges("Raja", 50)};
		int studsize = studentsages.length;
		double total = 0;
		for (int i = 0; i < studentsages.length; i++) {
			total = total + studentsages[i];
			// System.out.println(total);
			// System.out.println(studentsages[i]);
		}
		double averageage = total / studsize;
		System.out.println("Average age of student list is: " + averageage);
	}
}