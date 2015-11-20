package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.DishIngredients;

public interface DishIngredientsDao extends GenericDao<DishIngredients,Integer>{
	public List<DishIngredients> findByIDIngredients(Integer ingredient_id);
	public List<DishIngredients> findByIdDish(Integer dish_id);
}
