package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.MenuDao;
import cr.ulacit.model.Menu;
import cr.ulacit.service.MenuManager;
/*Implementación de la interfaz del MenuManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("menuManager")
@WebService(serviceName="MenuService",  endpointInterface ="cr.ulacit.service.MenuManager")
public class MenuManagerImpl extends GenericManagerImpl<Menu,Integer> implements MenuManager {
	MenuDao dao;
	public MenuManagerImpl(){
	}
	public MenuManagerImpl(MenuDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public List<Menu> getMenu() {
		return dao.getAll();
	}
}
