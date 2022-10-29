package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Service
public class CourseManager implements CourseService {
	private CourseRepository courseRepository;
	List<Course> courses;

	@Autowired
	public CourseManager(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAll() {
		return courseRepository.getAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseRepository.addCourse(course);
	}

	@Override
	public Course deleteCourse(Course course) {
		return courseRepository.deleteCourse(course);
	}

}
