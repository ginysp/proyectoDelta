package cr.ulacit.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cr.ulacit.model.MenuDish;

public class MenuDishDaoTest extends BaseDaoTestCase {
	@Autowired
	private MenuDishDao menuDisDao;
	
	@Test
	 public void testFindById() throws Exception{
		 log.debug("testing find dish by id...");
		 List<MenuDish> menuList = menuDisDao.findByIdDish(3);
		 assertNotNull(menuList.size());
	}
}
