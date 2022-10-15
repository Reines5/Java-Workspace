package kodlamaIO.dataAccess.teacher;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void addTeacher(Teacher teacher) {
		System.out.printf("Hibernate ile %s adlı öğretici eklendi.", teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		System.out.printf("Hibernate ile %s adlı öğretici silindi.", teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Engin DEMİROĞ"));
		teachers.add(new Teacher("Yiğit EŞMEN"));
		teachers.add(new Teacher("Fatih Enes ÇOBAN"));
		return teachers;
	}
}
