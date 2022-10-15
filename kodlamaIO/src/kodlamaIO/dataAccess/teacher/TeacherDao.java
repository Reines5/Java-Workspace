package kodlamaIO.dataAccess.teacher;

import java.util.List;

import kodlamaIO.entities.Teacher;

public interface TeacherDao {
	public void addTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
	public List<Teacher> getAllTeacher();
}
