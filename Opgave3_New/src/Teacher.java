import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> currentCourses;
    private ArrayList<String> canTeach;


    public Teacher(String name,ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course) && !currentCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
