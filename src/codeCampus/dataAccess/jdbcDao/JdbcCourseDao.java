package codeCampus.dataAccess.jdbcDao;

import codeCampus.dataAccess.CourseDao;
import codeCampus.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jdbc ile veri tabanından silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Jdbc ile veriler güncellendi");
		
	}

}
