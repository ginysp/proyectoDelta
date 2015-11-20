package cr.ulacit.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cr.ulacit.model.Dish;

public class DishDaoTest extends BaseDaoTestCase {
	//mvn test -Dtest=PersonDaoTest
	 @Autowired
	 private DishDao dishdao;
	 
	 @Test
	 public void testFindByIdDish() throws Exception{
		 //Dish dish=new Dish();
		 log.debug("testing find dish by id...");
		 List<Dish> dishList = dishdao.findByIdDish(2);
		 assertNotNull(dishList.size());
		 
		 
		 //assertSame(2,dish.getId_dish());
		//assertTrue("Result ID =2",true);
		// assertTrue("Result ID !=2",false);
	 }
	 @Test
	 public void testFindByName() throws Exception{
		 log.debug("testing find dish by name...");
		 List<Dish> dish = dishdao.findByName("Ensalada de papaya");
		 assertNotNull(dish.size());				
	 }
}
