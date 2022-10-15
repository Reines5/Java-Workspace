package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.category.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categories;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		categories = categoryDao.getAllCategory();
		this.loggers = loggers;
	}

	public void addCategory(Category category) throws Exception {
		checkCategory(category);
		
		categoryDao.addCategory(category);
		categories.add(category);

		loggers.forEach(logger -> logger.log("Kategori eklendi: " + category));
	}
	
	public void checkCategory(Category category) throws Exception {
		if (categories.stream().anyMatch(c -> c.getName().equalsIgnoreCase(category.getName())))
			throw new Exception("Farklı bir kategori ismi giriniz, kategori isimleri tekrar edemez.");
	}

	public void deleteCategory(Category category) {
		categoryDao.deleteCategory(category);
		categories.remove(category);

		loggers.forEach(logger -> logger.log("Kategori silindi: " + category));
	}

	public void displayCategories() {
		categories.forEach(c -> System.out.println(c.getName()));
	}

}
