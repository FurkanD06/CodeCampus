package codeCampus.business;

import java.util.ArrayList;
import java.util.List;

import codeCampus.business.abstracts.CategoryService;
import codeCampus.core.Logger;
import codeCampus.dataAccess.CategoryDao;
import codeCampus.entities.Category;

public class CategoryManager implements CategoryService {
	CategoryDao categoryDao;
	List<Category> categories = new ArrayList<>();
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories.add(new Category(1, "C#"));
		this.categories.add(new Category(1, "Java"));
		this.categories.add(new Category(1, "Pyhton"));
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category.getName().equalsIgnoreCase(category1.getName())) {
				throw new Exception("Aynı isimden kategori olamaz");
			}

		}
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

		categoryDao.add(category);

	}

	@Override
	public void delete(Category category) {
		categoryDao.delete(category);

	}

	@Override
	public void update(Category category) {
		categoryDao.update(category);

	}

}
