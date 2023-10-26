import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Math");
        Student student1 = new Student("Alice", student1PassedCourses);

        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("English");
        Student student2 = new Student("Bob", student2PassedCourses);

        ArrayList<String> teacher1CanTeach = new ArrayList<>();
        teacher1CanTeach.add("Math");
        Teacher teacher1 = new Teacher("Carol", teacher1CanTeach);

        ArrayList<String> teacher2CanTeach = new ArrayList<>();
        teacher2CanTeach.add("English");
        Teacher teacher2 = new Teacher("David", teacher2CanTeach);

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        // 3.7: Iterate through the persons list and add the course "Java 1.0" to all of them
        for (Person person : persons) {
            if (!person.addCourse("Java 1.0")) {
                System.out.print(person.getName() + " ");
                if (person instanceof Student) {
                    System.out.println("has already passed this course.");
                } else if (person instanceof Teacher) {
                    System.out.println("cannot teach this course.");
                }
            }
        }

    }
}
