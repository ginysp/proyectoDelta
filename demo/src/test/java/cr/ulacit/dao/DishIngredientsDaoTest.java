package cr.ulacit.dao;


import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DishIngredientsDaoTest extends BaseDaoTestCase{
	 @Autowired
	private DishIngredientsDao dishIngreDao;
	 
	
	 @Test
	 public void getDishTest() throws Exception{
		 System.out.println("Testing get dish ingredients");
		 dishIngreDao.getDishIngredients(1);
	 }
	
	
}
