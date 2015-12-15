package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.MenuDishDao;
import cr.ulacit.model.MenuDish;
import cr.ulacit.service.MenuDishManager;
/*Implementación de la interfaz del MenuDishManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("menuDishManager")
@WebService(serviceName="MenuDishService",  endpointInterface ="cr.ulacit.service.MenuDishManager")
public class MenuDishManagerImpl extends GenericManagerImpl<MenuDish, Integer> implements MenuDishManager {
	MenuDishDao dao;
	public MenuDishManagerImpl(){
	}
	public MenuDishManagerImpl(MenuDishDao menuDishDao){
		super();
		this.dao=menuDishDao;
	}
	
	@Override
	public List<MenuDish> getMenuDish() {
		return dao.getAll();
	}



}
