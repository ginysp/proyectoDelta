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
		System.out.println("Dishs:"+dish);
		System.out.println("Result:"+result);
	}
	@Test
	public void testGetDishID(){
	 System.out.println("testing get Dish...");
		manager.getDishbyID(2);	
	}
	@Test
	public void testCreateDish(){
		 System.out.println("testing create Dish...");
		 manager.createDish("Pizza", "Grande","Pizza de supreme");
	}
	@Test
	public void testUpdateDish(){
		 System.out.println("testing update Dish...");
		 manager.updateDish(2, "Tres Leches",  "mediano", "Tres leches especial de la casa");
		
	}
	@Test
	public void testDeleteDish(){
		 System.out.println("testing delete Dish...");
		 manager.deleteDish(1);
	}
	
	
	 
}
