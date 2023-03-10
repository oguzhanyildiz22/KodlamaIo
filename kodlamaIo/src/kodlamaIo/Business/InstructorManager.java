package kodlamaIo.Business;

import kodlamaIo.DatabaseAccess.InstructorDao.IInstructorDao;
import kodlamaIo.Entities.Instructor;
import kodlamaIo.core.logging.Logger;

public class InstructorManager {

	IInstructorDao instructorDao;
	Logger[] loggers;

	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getId());
		}
	}

}
