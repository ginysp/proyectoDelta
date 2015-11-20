package cr.ulacit.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cr.ulacit.model.Menu;

public class MenuDaoTest extends BaseDaoTestCase{
	 @Autowired
	 private MenuDao menuDao;
	 @Test
	 
	 public void testFindById() throws Exception{
		 log.debug("testing find menu by id...");
		 List<Menu> menuList=menuDao.findByIdMenu(3);
		 assertNotNull(menuList.size());
	 }
}
