package kodlamaIo.DatabaseAccess.InstructorDao;

import kodlamaIo.Entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Instructor saved with Hibernate.");
	}

}
