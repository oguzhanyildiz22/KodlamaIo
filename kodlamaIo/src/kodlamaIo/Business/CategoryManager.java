package kodlamaIo.Business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.DatabaseAccess.CategoryDao.ICategoryDao;
import kodlamaIo.Entities.Category;
import kodlamaIo.core.logging.Logger;

public class CategoryManager {

	ICategoryDao categoryDao;
	Logger[] loggers;
	List<Category> categories = new ArrayList<>();
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category existingCategory : categories) {

			if (existingCategory.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Bu isim mevcuttur.");
			}
			
		}
        
		categoryDao.add(category);
		for (Logger loggers : loggers) {
			loggers.log(category.getId() + " - " + category.getCategoryName());
		}
	}

}
