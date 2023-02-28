package codeCampus.business.abstracts;

import codeCampus.entities.Category;

public interface CategoryService{
	void add(Category category)throws Exception;

	void delete(Category category)throws Exception;

	void update(Category category)throws Exception;
}
