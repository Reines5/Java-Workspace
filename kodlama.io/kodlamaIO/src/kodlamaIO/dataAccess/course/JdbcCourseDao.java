package kodlamaIO.dataAccess.course;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Teacher;

public class JdbcCourseDao implements CourseDao {

	@Override
	public List<Course> getAllCourses() {
		Teacher enginDemirog = new Teacher("Engin Demirog");
		Category category = new Category("Programlama");
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", category, 0, enginDemirog));
		courses.add(new Course("Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", category, 0, enginDemirog));
		courses.add(new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", category, 0, enginDemirog));
		courses.add(new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", category, 0, enginDemirog));
		return courses;
	}

	@Override
	public void addCourse(Course course) {
		System.out.printf("JDBC ile %s kursu eklendi.%n", course.getName());
	}

	@Override
	public void deleteCourse(Course course) {
		System.out.printf("JDBC ile %s kursu silindi.%n", course.getName());
	}

}
