package kodlamaIO;

import java.util.List;

import kodlamaIO.business.CourseManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.FileLogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.course.HibernateCourseDao;

public class Main {

	public static void main(String[] args) {
		List<Logger> loggers = List.of(new DatabaseLogger(), new FileLogger());
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.displayCourses();
	}

}
