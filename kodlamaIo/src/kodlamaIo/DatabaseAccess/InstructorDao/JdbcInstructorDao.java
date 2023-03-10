package kodlamaIo.DatabaseAccess.InstructorDao;

import kodlamaIo.Entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Instructor saved with JBDC.");
	}

}
