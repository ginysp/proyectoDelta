package cr.ulacit.serviceImpl;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import cr.ulacit.dao.DishDao;
import cr.ulacit.model.Dish;
import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.*;


public class DishManagerImplTest extends BaseManagerMockTestCase {
	@InjectMocks
	private DishManagerImpl manager;
	@Mock
	private DishDao dao;
	
	@Test
    public void testGetDish() {
		System.out.println("Testing get");
		//given
		final Integer id=2;
		final Dish dish=new Dish();
		given(dao.get(id)).willReturn(dish);
		//when
		Dish result=manager.get(id);
		//then
		assertSame(dish,result);
	}
	
	@Test
	public void testupdateDish(){
		System.out.println("Testing update dish ");
		manager.updateDish(1,"Arroz con pollo","grande","Especial de arroz de pollo");
	}
	@Test
	public void testCreateDish(){
		System.out.println("Testing create dish ");
		manager.createDish("Pizza","grande", "Pizza de la casa supreme");
	}
	@Test
	public void testDeleteDish(){
		System.out.println("Testing delete dish ");
		manager.deleteDish(1);
	}
	

	
	
	 
}
