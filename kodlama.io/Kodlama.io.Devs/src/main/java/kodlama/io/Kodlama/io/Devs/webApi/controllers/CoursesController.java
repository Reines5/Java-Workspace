package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {
	private CourseService courseService;

	@Autowired
	public CoursesController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@GetMapping("/getall")
	public List<Course> getAll() {
		return courseService.getAll();
	}

	@PostMapping("/addcourse")
	public Course addCourse(Course course) {
		return courseService.addCourse(course);
	}
	
	@DeleteMapping("/deletecourse")
	public Course deleCourse(Course course) {
		return courseService.deleteCourse(course);
	}
}
