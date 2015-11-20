package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Ingredients;


public interface IngredientsDao extends GenericDao<Ingredients,Integer> {
	public List<Ingredients> findById(Integer id);
	public List<Ingredients> findByName(String name);
}
