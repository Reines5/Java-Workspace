package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.course.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		courses = courseDao.getAllCourses();
		this.loggers = loggers;
	}

	public void addCourse(Course course) throws Exception {
		checkCourseName(course);
		checkCoursePrice(course);

		courseDao.addCourse(course);
		courses.add(course);

		loggers.forEach(logger -> logger.log("Kurs eklendi: " + course));
	}

	public void checkCourseName(Course course) throws Exception {
		if (courses.stream().anyMatch(c -> course.getName().equalsIgnoreCase(c.getName())))
			throw new Exception("Farklı bir kurs ismi giriniz, kurs isimleri tekrar edemez.");
	}

	public void checkCoursePrice(Course course) throws Exception {
		if (course.getPrice() < 0)
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
	}

	public void deleteCourse(Course course) {
		courseDao.deleteCourse(course);
		courses.remove(course);

		loggers.forEach(logger -> logger.log("Kurs silindi: " + course));
	}

	public void displayCourses() {
		courses.forEach(course -> System.out.println(course));
	}

}
