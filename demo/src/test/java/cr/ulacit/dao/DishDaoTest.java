package cr.ulacit.dao;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DishDaoTest extends BaseDaoTestCase {
	//mvn test -Dtest=PersonDaoTest
	 @Autowired
	 private DishDao dishdao;
	
	 @Test
	 public void testCreateDish() throws Exception{
		 System.out.println("testing create Dish...");
		 dishdao.createDish("Arroz con pollo", "mediano", "arroz con pollo y verduras");
		 
	 }
	 @Test
	 public void testGetDish() throws Exception{
		 System.out.println("testing get Dish...");
		 dishdao.getDish(1);
	 }
	 @Test
	 public void testUpdateDish() throws Exception{
		 System.out.println("Testing update Dish...");
		  dishdao.updateDish(3, "Pasta", "Pequeño", "pasta con atún");  
	 }
	 @Test
	 public void testDeleteDish() throws Exception{
		 System.out.println("Testing delete Dish...");
		 dishdao.deleteDish(3);
	 }
	 
}
