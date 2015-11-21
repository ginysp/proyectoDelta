package cr.ulacit.dao;

import static org.junit.Assert.*;

import java.util.List;
import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import cr.ulacit.model.DishIngredients;

public class DishIngredientsDaoTest extends BaseDaoTestCase{
	 @Autowired
	private DishIngredientsDao dishIngreDao;
	 
	 @Test
	 public void testFindByIdIngredients() throws Exception{
		 log.debug("testing find dishIngredients by idIngredients...");
		 List<DishIngredients> dIngList = dishIngreDao.findByIDIngredients(1);
		 assertNotNull(dIngList.size());
		 
	 }
	 @Test
	 public void testFindByIdDish() throws Exception{
		 log.debug("testing find dish info by idDish...");
		 List<DishIngredients> dIngList = dishIngreDao.findByIdDish(2);
		 assertNotNull(dIngList.size());
	 }
	 
	 @Test
	 public void findCaloriesByIdDish() throws Exception{
		 log.debug("testing find dishIngredients calories by idDish...");
		 List<Double> dIngList = dishIngreDao.findCaloriesByIdDish(2);
		  assertTrue(dIngList.size() > 0);
	 }
}
