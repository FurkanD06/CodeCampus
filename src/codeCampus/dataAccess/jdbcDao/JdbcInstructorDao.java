package codeCampus.dataAccess.jdbcDao;

import codeCampus.dataAccess.InstructorDao;
import codeCampus.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanından silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Jdbc ile veriler güncellendi");
		
	}

}
