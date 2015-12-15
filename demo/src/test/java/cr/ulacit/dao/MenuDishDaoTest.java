package cr.ulacit.dao;
import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuDishDaoTest extends BaseDaoTestCase {
	@Autowired
	private MenuDishDao menuDisDao;
	
	@Test
	 public void testFindById() throws Exception{
		 log.debug("testing find dish by id...");
		menuDisDao.getMenu(2);
	}
}
