import domain.Course;
import domain.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course_01 = new Course();
        course_01.setTitle("Rust Developer");
        course_01.setDescription("Description Rust Developer");
        course_01.setWorkload(180);

        Mentoring mentoring_01 = new Mentoring();
        mentoring_01.setTitle("Learn SQL injection");
        mentoring_01.setDescription("Learning");
        mentoring_01.setDate(LocalDate.now());

        System.out.println(course_01);
        System.out.println(mentoring_01);
    }
}
