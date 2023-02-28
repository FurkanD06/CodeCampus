package codeCampus.dataAccess.jdbcDao;

import codeCampus.dataAccess.CategoryDao;
import codeCampus.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile veri tabanından silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Jdbc ile veriler güncellendi");
		
	}

}
