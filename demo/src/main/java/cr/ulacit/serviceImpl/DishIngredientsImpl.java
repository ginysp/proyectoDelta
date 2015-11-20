package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.DishIngredientsDao;
import cr.ulacit.model.DishIngredients;
import cr.ulacit.service.DishIngredientsManager;

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

	@Override
	public List<DishIngredients> findByIdIngredient(Integer ingredient_id) {
		return dishIngreDao.findByIDIngredients(ingredient_id);
	}

	@Override
	public List<DishIngredients> findByIdDish(Integer dish_id) {
		return dishIngreDao.findByIdDish(dish_id);
	}

	@Override
	public List<DishIngredients> getDishIngredients() {
		return dishIngreDao.getAll();
	}

}
