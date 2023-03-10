package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.Business.CategoryManager;
import kodlamaIo.Business.CourseManager;
import kodlamaIo.Business.InstructorManager;
import kodlamaIo.DatabaseAccess.CategoryDao.HibernateCategoryDao;
import kodlamaIo.DatabaseAccess.CourseDao.JdbcCourseDao;
import kodlamaIo.DatabaseAccess.InstructorDao.HibernateInstructorDao;
import kodlamaIo.Entities.Category;
import kodlamaIo.Entities.Course;
import kodlamaIo.Entities.Instructor;
import kodlamaIo.core.logging.DatabaseLogging;
import kodlamaIo.core.logging.FileLogging;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogging;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogging(), new FileLogging(), new MailLogging() };

		Instructor instructor1 = new Instructor(1, "oguzhan", "yildiz", "xyz@gmail.com");
		Instructor instructor2 = new Instructor(2, "berkay", "yildiz", "abc@gmail.com");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		System.out.println("--------------------------------------------------------------");

		Course course1 = new Course(1, "JAVA", 70);
		Course course2 = new Course(2, "C++", 80);
		Course course3 = new Course(3, "C#", 100);

		List<Course> courses = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

		System.out.println("--------------------------------------------------------------");

		Category category1 = new Category(1, "Front-end");
		Category category2 = new Category(2, "Back-end");
		Category category3 = new Category(3, "AI");

		List<Category> categories = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);

		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);

		System.out.println("--------------------------------------------------------------");

	}

}
