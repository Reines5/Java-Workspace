package kodlamaIO.dataAccess.category;

import java.util.List;

import kodlamaIO.entities.Category;

public interface CategoryDao {
	public void addCategory(Category category);

	public void deleteCategory(Category category);

	public List<Category> getAllCategory();
}
