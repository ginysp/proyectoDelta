package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Menu;

public interface MenuDao extends GenericDao<Menu,Integer> {
	public List<Menu> findByIdMenu(Integer id);
}
