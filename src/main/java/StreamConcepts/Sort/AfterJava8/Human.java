package StreamConcepts.Sort.AfterJava8;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareByNameThenAge(Human human1, Human human2) {
        if (human1.name.equals(human2.name)) {
            return Integer.compare(human1.age, human2.age);
        } else {
            return human1.name.compareTo(human2.name);
        }
    }
}
