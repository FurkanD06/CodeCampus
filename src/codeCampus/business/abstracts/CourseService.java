package codeCampus.business.abstracts;

import codeCampus.entities.Course;

public interface CourseService {
	void add(Course course)throws Exception;

	void delete(Course course)throws Exception;

	void update(Course course)throws Exception;
}
