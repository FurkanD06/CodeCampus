package codeCampus.business.abstracts;

import codeCampus.entities.Instructor;

public interface InstructorService {
	void add(Instructor instructor)throws Exception;

	void delete(Instructor instructor)throws Exception;

	void update(Instructor instructor)throws Exception;
}
