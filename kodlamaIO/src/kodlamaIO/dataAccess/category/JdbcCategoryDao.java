package kodlamaIO.dataAccess.category;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void addCategory(Category category) {
		System.out.printf("JDBC ile %s kategorisi eklendi.%n", category.getName());
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category("Programlama"));
		return categories;
	}

	@Override
	public void deleteCategory(Category category) {
		System.out.printf("JDBC ile %s kategorisi silindi.%n", category.getName());
	}

}
