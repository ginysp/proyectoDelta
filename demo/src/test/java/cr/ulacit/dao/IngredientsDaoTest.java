package cr.ulacit.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cr.ulacit.model.Ingredients;

public class IngredientsDaoTest extends BaseDaoTestCase {
	@Autowired
	private IngredientsDao ingreDao;

	@Test
	 public void testFindByName() throws Exception{
		 log.debug("testing find ingredient by name...");
		 List<Ingredients> ingredients=null;
		 ingredients=ingreDao.findByName("Melocotones");
		 assertNotNull(ingredients.size());
	}
	 @Test
	 public void testCreateIngredients() throws Exception{
		 System.out.println("testing create Ingredients...");
		 ingreDao.createIngredients("Pasta",450);
	 }
	 @Test
	 public void testGetIngredients() throws Exception{
		 System.out.println("testing create Ingredients...");
		 ingreDao.getIngredients("Melocotones");
	 }
	 @Test
	 public void testUpdateIngredients() throws Exception{
		 System.out.println("testing create Ingredients...");
		 ingreDao.updateIngredients("Melocotones",500);
	 }
	 @Test
	 public void testDeleteIngredients() throws Exception{
		 System.out.println("testing create Ingredients...");
		 ingreDao.deleteIngredients(1);
	 }
}

