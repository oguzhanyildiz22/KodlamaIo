package kodlamaIo.DatabaseAccess.CourseDao;

import kodlamaIo.Entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println("Course saved with Hibernate.");
	}

}
