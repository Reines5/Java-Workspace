package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Repository
public class InMemoryCourseRepository implements CourseRepository {
	List<Course> courses;

	public InMemoryCourseRepository() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1, "Sıfırdan ileri seviyeye C#"));
		courses.add(new Course(2, "Sıfırdan ileri seviyeye Java"));
		courses.add(new Course(3, "Sıfırdan ileri seviyeye Python"));

	}

	public void checkCourseName(Course course) throws Exception {
		if (courses.stream().anyMatch(c -> course.getName().equalsIgnoreCase(c.getName())))
			throw new Exception("Farklı bir kurs ismi giriniz, kurs isimleri tekrar edemez.");
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

	@Override
	public Course addCourse(Course course) {
		try {
			checkCourseName(course);
		} catch (Exception e) {
			e.printStackTrace();
		}

		courses.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(Course course) {
		System.out.printf("Kurs silindi: %s%n", course.getName());
		return course;
	}

}
