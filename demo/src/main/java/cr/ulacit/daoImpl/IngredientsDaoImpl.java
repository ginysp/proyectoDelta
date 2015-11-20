package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.IngredientsDao;
import cr.ulacit.model.Ingredients;

@Repository("ingredientsDao")
public class IngredientsDaoImpl extends GenericDaoHibernate<Ingredients,Integer> implements IngredientsDao{

	public IngredientsDaoImpl() {
		super(Ingredients.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ingredients> findById(Integer id) {
		return getSession().createCriteria(Ingredients.class).add(Restrictions.eq("id_ingredients",id)).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ingredients> findByName(String name) {
		return getSession().createCriteria(Ingredients.class).add(Restrictions.eq("name",name)).list();
	}

}
