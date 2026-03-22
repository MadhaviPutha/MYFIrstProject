package Project;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StudentPack.Student;

public class MainSample {

  public static void main(String[] args) throws Exception {
    List<Student> students =
        Arrays.asList(
            new Student("Max", 18),
            new Student("Peter", 23),
            new Student("Pamela", 23),
            new Student("David", 12));   
    

    Double averageAge = students
        .stream()
        .collect(Collectors.averagingInt(p -> p.age));

    System.out.println(averageAge);     // 19.0
  }

}
class Student {
  String name;
  int age;

  Student(String name, int age) {
      this.name = name;
      this.age = age;
  }

  @Override
  public String toString() {
      return name;
  }
}