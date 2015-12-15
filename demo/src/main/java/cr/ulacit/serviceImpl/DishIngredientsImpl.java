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
	/*Este método tiene como función obtener la sumatoria de las calorias del platillo
	 *@Param: List<Double> list
	 *@Return: double
	 */
	@Override
	public double totalCalories(List<Double> list) {
		
		double totalCal = 0;
		
		for(int i=0; i < list.size();i++)
		{
			totalCal = totalCal + list.get(i);
		}
		
		return totalCal;
	}
	/*Este método tiene como función crear un nuevo ingrediente del platillo
	 *@Param: integer idDish, indentificador del platillo
	 *@Param: integer idIngredient, identificador del ingrediente
	 *@Return: boolean
	 */
	@Override
	public boolean createdishingredient(Integer idDish, Integer idIngredient){
	
		return false;
	}
	/*Este método tiene como función eliminar un ingrediente del platillo
	 * @Param: integer idDish, identificador del platillo
	 *@Param: integer idIngredient, identificador del ingrediente
	 *@Return: boolean
	 */
	@Override
	public boolean deletedishingredient(Integer idDish, Integer idIngredient){
	
		return false;
	}
	@Override
	public List<DishIngredients> findByIdIngredient(Integer ingredient_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
