package Project;

public class Teacher extends Person {
	String subject;

	public String SetStudentGrade(String subject) {
		this.subject = subject;
		System.out.println("Stundent belong to Grade: " + this.subject);
		return this.subject;
	}

	public void Add() {

	}

	public void Update() {
	}

	public void Delete() {
	}

	public void View() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
