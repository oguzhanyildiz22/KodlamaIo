package kodlamaIo.Business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.DatabaseAccess.CourseDao.ICourseDao;
import kodlamaIo.Entities.Course;
import kodlamaIo.core.logging.Logger;

public class CourseManager {

	ICourseDao courseDao;
	List<Course> courses = new ArrayList<>();
	Logger[] loggers;

	public CourseManager(ICourseDao courseDao, List<Course> courses, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		for (Course existingCourse  : courses) {
			if (existingCourse .getCourseName().equals(course.getCourseName())) {
				throw new Exception("Ayni kurs adindan bulunmaktadir.");
			}
			
		}
		if (course.getPrice() < 0) {
			throw new Exception("kurs fiyati 0 dan kucuk olamaz.");
		}

		courseDao.add(course);

		for (Logger loggers : loggers) {
			loggers.log(course.getCourseName() + " - " + course.getId());
		}
	}
}
