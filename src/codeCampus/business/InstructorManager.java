package codeCampus.business;

import codeCampus.business.abstracts.InstructorService;
import codeCampus.core.Logger;
import codeCampus.dataAccess.InstructorDao;
import codeCampus.entities.Instructor;

public class InstructorManager implements InstructorService{
	
	InstructorDao instructorDao;
	Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		this.loggers = loggers;
		this.instructorDao = instructorDao;
	}

	@Override
	public void add(Instructor instructor) throws Exception {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName()+instructor.getLastName());
		}
		
	}

	@Override
	public void delete(Instructor instructor) throws Exception {
		instructorDao.delete(instructor);
		
	}

	@Override
	public void update(Instructor instructor) throws Exception {
		instructorDao.update(instructor);
		
	}

}
