import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TripleSorter {

    public static String sort(List<Student> students) {

         Comparator<Student> sortOrder = Comparator
                .comparingInt(Student::getGpa).reversed()
                .thenComparing(s -> s.getFullName().split(" ")[1].charAt(0))
                .thenComparingInt(Student::getAge);


        return students.stream().sorted(sortOrder)
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));
        System.out.println (TripleSorter.sort(students));
        Student student = new Student(1, 20, "John Smith");

        System.out.println(student.getFullName().split(" ")[1]);
        char ch = student.getFullName().split(" ")[1].charAt(0);
        System.out.println(ch);

    }
}