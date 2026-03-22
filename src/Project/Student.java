package Project;

public class Student extends Person {
	int grade;

	Person person = new Person();

	public int SetStudentGrade(int grade) {
		this.grade = grade;
		return this.grade;
	}

	public void Add(char cmd, char per, String name, char gender, int grade) {
		if ((cmd == 'A') && (per == 'S')) {
			this.name = name;
			System.out.println("Add Student details: " + "A:S:" + person.SetName(name) + ":" + person.SetGender(gender)
					+ ":" + SetStudentGrade(grade));
		}
	}

	public void Update(char cmd, char per, String name, char gender, int grade) {
		if ((cmd == 'U') && (per == 'S')) {
			this.name = name;
			System.out.println("Updated Student details: " + "U:S:" + person.SetName(name) + ":"
					+ person.SetGender(gender) + ":" + SetStudentGrade(grade));
		}
	}

	public void Delete(char cmd, char per, String name, char gender, int grade) {
		if ((cmd == 'D') && (per == 'S')) {
			this.name = name;
			System.out.println("Student details: ");
		}
	}

}
