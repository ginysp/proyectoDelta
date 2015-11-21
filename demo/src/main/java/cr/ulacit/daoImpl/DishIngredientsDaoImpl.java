package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.DishIngredientsDao;
import cr.ulacit.model.DishIngredients;

@Repository("dishIngredientsDao")
public class DishIngredientsDaoImpl extends GenericDaoHibernate<DishIngredients,Integer> implements DishIngredientsDao {

	public DishIngredientsDaoImpl() {
		super(DishIngredients.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DishIngredients> findByIDIngredients(Integer ingredient_id) {
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("ingredientsid_ingredient",ingredient_id)).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DishIngredients> findByIdDish(Integer dish_id) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("dishid_dish",dish_id)).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Double> findCaloriesByIdDish(Integer dish_id) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("dishid_dish",dish_id)).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public double totalCalories(List<Double> listCalories) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("list",listCalories)).list().size();
	}
}
