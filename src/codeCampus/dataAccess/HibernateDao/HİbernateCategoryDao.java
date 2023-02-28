package codeCampus.dataAccess.HibernateDao;

import codeCampus.dataAccess.CategoryDao;
import codeCampus.entities.Category;

public class HİbernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile veri tabanından silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile veriler güncellendi");
		
	}

}
