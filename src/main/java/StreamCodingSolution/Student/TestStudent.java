package StreamCodingSolution.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Tom", 1, 90, 15);
        Student s2 = new Student("Lisa", 2, 80, 16);
        Student s3 = new Student("Rick", 3, 95, 17);
        Student s4 = new Student("Young", 4, 100, 15);
        Student s5 = new Student("Robby", 5, 50, 14);

        // Add all student object to the array list.

        List<Student> listOfStudents = Arrays.asList(s1, s2, s3, s4, s5);
        System.out.println("Total Number Of students " + listOfStudents.size());

        // List all the students details
        listOfStudents.stream()
                .forEach(e -> System.out.println(e)); //--> method Reference option - System.out::println

        //Give me all students that have grade greater than 80.
        ;
        listOfStudents.stream()
                .filter(s -> s.getMarks() > 80)
                .forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));

        //Give me a student name which has the highest grade.
        Optional<Integer> highestMarks = listOfStudents.stream()
                .map(Student::getMarks) // --> Before the method reference is implemented - e -> e.getMarks()
                .max(Comparator.naturalOrder()); // You can also use (Integer:: Compare)

        System.out.println(highestMarks.get());


    }
}
