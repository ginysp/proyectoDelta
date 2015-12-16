package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.DishIngredientsDao;
import cr.ulacit.model.DishIngredients;
import cr.ulacit.service.DishIngredientsManager;
/*Implementación de la interfaz del DishIngredientsManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("dishIngredientsManager")
@WebService(serviceName="DishIngredientsService",endpointInterface ="cr.ulacit.service.DishIngredientsManager")
public class DishIngredientsImpl extends GenericManagerImpl<DishIngredients,Integer> implements DishIngredientsManager{
	DishIngredientsDao dishIngreDao;
	
	public DishIngredientsImpl(){
	}
	public DishIngredientsImpl(DishIngredientsDao dishIngreDao) {
		super();
		this.dishIngreDao = dishIngreDao;
	}
		
	/*Este método tiene como función retornar la lista de todos los ingredientes de los distintos platilos
	 *@Return: List<DishIngredients>
	 */
	@Override
	public List<DishIngredients> getDishIngredients() {
		return dishIngreDao.getAll();
	}
	@Override
	public void getDishIngredients(Integer id_dishingredients) {
		dishIngreDao.getDishIngredients(id_dishingredients);
		
	}
	
	
}
