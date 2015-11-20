package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.MenuDish;

public interface MenuDishDao extends GenericDao<MenuDish,Integer>{
	public List<MenuDish> findByIdDish(Integer id);

}
