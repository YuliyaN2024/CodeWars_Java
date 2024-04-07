
class Student {

    public Student(int age, int gpa, String fullName) {
        this.age = age;
        this.gpa = gpa;
        this.fullName = fullName;
    }

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    private int gpa;
    private int age;
    private String fullName;

    private String firstName;
    private String lastName;
    public  String studentNumber;

    public int getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFullName1() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return fullName;
    }
}