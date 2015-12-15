package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.DishDao;
import cr.ulacit.dto.DishDTO;
import cr.ulacit.mapper.DishMapper;
import cr.ulacit.model.Dish;
import cr.ulacit.service.DishManager;
/*Implementación de la interfaz del DishManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("dishManager")
@WebService(serviceName="DishService",  endpointInterface ="cr.ulacit.service.DishManager")
public class DishManagerImpl extends GenericManagerImpl<Dish,Integer> implements DishManager {
	DishDao dishDao;
	Dish dish;
	
	public DishManagerImpl(){
	}
	@Autowired
	public DishManagerImpl(DishDao dishDao) {
		super(dishDao);
		this.dishDao=dishDao;
	}
	/*Este método tiene como función encontrar un platillo mendiante su identificador único
	 *@Param: Integer id_dish, identificador del platillo
	 *@Return: List<DishDTO>
	 */
	@Override
	public List<DishDTO> findByID(Integer id_dish) {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.findByIdDish(id_dish);
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}
	/*Este método tiene como función encontrar un platillo mendiante su nombre 
	 *@Param: String name, nombre del platillo
	 *@Return: List<DishDTO>
	 */
	@Override
	public List<DishDTO> findByName(String name) {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.findByName(name);
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}

	/*Este método tiene como función retornar todos los platillos
	 *@Return: List<DishDTO>
	 */
	@Override
	public List<DishDTO> getDish() {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.getAll();
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}
	@Override
	public void getDishbyID(Integer id_dish) {
		dishDao.getDish(id_dish);
		
	}
	@Override
	public void createDish(String name, String size, String description) {
		dishDao.createDish(name, size, description);
		
	}
	@Override
	public void updateDish(Integer dish_id, String name, String size, String description) {
		dishDao.updateDish(dish_id, name, size, description);
		
	}
	@Override
	public void deleteDish(Integer dish_id) {
		dishDao.deleteDish(dish_id);
	}
	
}
