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
	 public void testFindById() throws Exception{
		 log.debug("testing find ingredient by id...");
		 List<Ingredients> ingreList=ingreDao.findById(4);
		 assertNotNull(ingreList.size());
	}
	@Test
	 public void testFindByName() throws Exception{
		 log.debug("testing find ingredient by name...");
		 List<Ingredients> ingredients=null;
		 ingredients=ingreDao.findByName("Melocotones");
		 assertNotNull(ingredients.size());
	}
}
