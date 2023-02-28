package codeCampus.dataAccess;

import codeCampus.entities.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
}
