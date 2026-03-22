package StudentPack;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentClass {
  public static void main(String[] args) throws Exception {
    List<Student> students = Arrays.asList(
            new Student("Madhavi", 20),
            new Student("Khushi", 8),
            new Student("Hemanth", 13),
            new Student("Suraj", 42),  
    		new Student("Sandhya", 28),
    		new Student("Rohini", 23),
    		new Student("Radhika", 53),
    		new Student("Saif Aii Khan", 59)); 
    Double averageAge = students.stream().collect(Collectors.averagingInt(p -> p.age));
    System.out.println(averageAge); 
    int studsize = students.size();
    System.out.println(studsize); 
    
  }
}
class Student {
  String name;
  int age;
  Student(String studentname, int studentage) {
      this.name = studentname;
      this.age = studentage;
  }

  @Override
  public String toString() {
      return name;
  }
}