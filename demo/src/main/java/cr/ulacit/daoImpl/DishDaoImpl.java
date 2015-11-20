package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.DishDao;
import cr.ulacit.model.Dish;

@Repository("dishDao")
public class DishDaoImpl extends GenericDaoHibernate<Dish, Integer> implements DishDao {

	public DishDaoImpl() {
		super(Dish.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> findByIdDish(Integer id) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("id_dish",id)).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> findByName(String name) {
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("name",name)).list();
	}
	
}


//private int quantity;private Dish Dish;private Ingredients Ingredients
//tabla ingredientsid_ingredient //tabla dishid_dish
