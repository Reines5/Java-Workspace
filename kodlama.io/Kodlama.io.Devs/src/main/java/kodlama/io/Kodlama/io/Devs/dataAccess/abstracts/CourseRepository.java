package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

public interface CourseRepository {
	List<Course> getAll();
	Course addCourse(Course course);
	Course deleteCourse(Course course);
}
