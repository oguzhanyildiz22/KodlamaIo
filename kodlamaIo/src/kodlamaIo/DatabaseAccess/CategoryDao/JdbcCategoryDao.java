package kodlamaIo.DatabaseAccess.CategoryDao;

import kodlamaIo.Entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category saved with JBDC.");
		
	}

}
