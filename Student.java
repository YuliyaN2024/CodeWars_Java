
class Student {

    public Student(int age, int gpa, String fullName) {
        this.age = age;
        this.gpa = gpa;
        this.fullName = fullName;
    }

    private int gpa;
    private int age;
    private String fullName;

    public int getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
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

    @Override
    public String toString() {
        return fullName;
    }
}