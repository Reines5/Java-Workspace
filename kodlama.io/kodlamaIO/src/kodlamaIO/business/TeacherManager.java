package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.teacher.TeacherDao;
import kodlamaIO.entities.Teacher;

public class TeacherManager {
	private TeacherDao teacherDao;
	private List<Teacher> teachers;
	private List<Logger> loggers;

	public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
		this.teacherDao = teacherDao;
		teachers = teacherDao.getAllTeacher();
		this.loggers = loggers;
	}

	public void addTeacher(Teacher teacher) throws Exception {
		checkName(teacher);
		
		teacherDao.addTeacher(teacher);
		teachers.add(teacher);

		loggers.forEach(logger -> logger.log("Öğretici eklendi: " + teacher));
	}

	public void checkName(Teacher teacher) throws Exception {
		if (teachers.stream().anyMatch(t -> teacher.getName().equalsIgnoreCase(t.getName())))
			throw new Exception("Farklı bir öğretici ismi giriniz, öğretici isimleri tekrar edemez.");
	}

	public void deleteTeacher(Teacher teacher) {
		teacherDao.deleteTeacher(teacher);
		teachers.remove(teacher);

		loggers.forEach(logger -> logger.log("Öğretici silindi: " + teacher));
	}

	public void displayTeachers() {
		teachers.forEach(teacher -> System.out.println(teacher.getName()));
	}

}
