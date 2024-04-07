import java.util.function.Function;

 class FunctionalProgramming {
    public static Function<Student, Boolean> f = student ->  ((student.getFullName1().equals("John Smith"))
            && (student.getStudentNumber().equals("js123")));//Make me a function; remember to set the types!


    public static void main(String[] args) {
        Student jSmith = new Student("John", "Smith", "js123");
        System.out.println(FunctionalProgramming.f.apply(jSmith));
    }
}