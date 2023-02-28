package codeCampus.dataAccess.HibernateDao;

import codeCampus.dataAccess.CourseDao;
import codeCampus.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veri tabanından silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile veriler güncellendi");
		
	}

}
