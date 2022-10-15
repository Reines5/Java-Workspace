package kodlamaIO.dataAccess.course;

import java.util.List;

import kodlamaIO.entities.Course;

public interface CourseDao {
	public void addCourse(Course course);

	public void deleteCourse(Course course);

	public List<Course> getAllCourses();
}
