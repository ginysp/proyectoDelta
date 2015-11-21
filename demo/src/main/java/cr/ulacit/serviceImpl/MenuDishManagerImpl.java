package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.MenuDishDao;
import cr.ulacit.model.MenuDish;
import cr.ulacit.service.MenuDishManager;
@Transactional
@Service("menuManager")
@WebService(serviceName="MenuService",  endpointInterface ="cr.ulacit.service.MenuManager")
public class MenuDishManagerImpl extends GenericManagerImpl<MenuDish, Integer> implements MenuDishManager {
	MenuDishDao dao;
	public MenuDishManagerImpl(){
	}
	public MenuDishManagerImpl(MenuDishDao menuDishDao){
		super();
		this.dao=menuDishDao;
	}
	@Override
	public List<MenuDish> findByIdDish(Integer menu_id) {
		return dao.findByIdDish(menu_id);
	}
	
	@Override
	public boolean createmenudish(Integer idMenu, Integer idDish){
		return false;
	}
	
	@Override
	public boolean deletemenudish(Integer idMenu, Integer idDish){
		return false;
	}

}
