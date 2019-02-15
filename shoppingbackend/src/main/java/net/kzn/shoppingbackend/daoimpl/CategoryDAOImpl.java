package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDao {

	public static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescripion("This ois telivision section");
		category.setImageURL("cat_1.png");

		category.setId(2);
		category.setName("mobile");
		category.setDescripion("This ois mobile section");
		category.setImageURL("cat_2.png");

		category.setId(3);
		category.setName("laptop");
		category.setDescripion("This ois laptop section");
		category.setImageURL("cat_3.png");
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
