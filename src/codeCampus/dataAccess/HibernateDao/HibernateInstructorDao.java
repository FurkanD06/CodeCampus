package codeCampus.dataAccess.HibernateDao;

import codeCampus.dataAccess.InstructorDao;
import codeCampus.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanından silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Hİbernate ile veriler güncellendi");
		
	}
	
}
