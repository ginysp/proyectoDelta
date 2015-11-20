package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Dish;

public interface DishDao extends GenericDao<Dish,Integer>{
	public List<Dish> findByIdDish(Integer id);
	public List<Dish> findByName(String name);
}

