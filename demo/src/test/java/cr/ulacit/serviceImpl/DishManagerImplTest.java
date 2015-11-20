package cr.ulacit.serviceImpl;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import cr.ulacit.dao.DishDao;
import cr.ulacit.model.Dish;
import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;

public class DishManagerImplTest extends BaseManagerMockTestCase {
	@InjectMocks
	private DishManagerImpl manager;
	@Mock
	private DishDao dao;
	
	@Test
    public void testGetDish() {
		log.debug("Testing get");
		//given
		final Integer id=2;
		final Dish dish=new Dish();
		given(dao.get(id)).willReturn(dish);
		//when
		Dish result=manager.get(id);
		//then
		assertSame(dish,result);
		log.info("Dishs:"+dish);
		log.info("Result:"+result);
	}
	public void testGetDishs(){
		log.debug("Testing get all");
		//given
		final List dishs=new ArrayList();
		given(dao.getAll()).willReturn(dishs);
		//when
		List result=manager.getAll();
		//then
		assertSame(dishs,result);
		log.info("Dishs:"+dishs);
		log.info("Result:"+result);
		
	}
	 
}
