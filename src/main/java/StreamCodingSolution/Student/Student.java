package StreamCodingSolution.Student;

public class Student {

    private String Name;
    private int rollNum;
    private int marks;
    private int age;

    public Student(String name, int rollNum, int marks, int age) {
        Name = name;
        this.rollNum = rollNum;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
