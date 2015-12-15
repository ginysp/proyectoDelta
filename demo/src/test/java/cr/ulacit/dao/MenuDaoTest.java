package cr.ulacit.dao;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuDaoTest extends BaseDaoTestCase{
	 @Autowired
	 private MenuDao menuDao;
	 @Test
	 
	 public void testFindById() throws Exception{
		 log.debug("testing find menu by id...");
		 menuDao.findMenuByID(1);
	 }
}
