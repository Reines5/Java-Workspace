package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

public interface CourseService {
	List<Course> getAll();
	Course addCourse(Course course);
	Course deleteCourse(Course course);
}
