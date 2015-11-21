package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.MenuDao;
import cr.ulacit.dto.MenuDTO;
import cr.ulacit.mapper.MenuMapper;
import cr.ulacit.model.Menu;
import cr.ulacit.service.MenuManager;

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
	public List<MenuDTO> findByID(Integer id_menu) {
		List<MenuDTO> menuDTOs=null;
		List<Menu> menuList= dao.findByIdMenu(id_menu);
		menuDTOs=MenuMapper.INSTANCE.MenusDTOs(menuList);
		return menuDTOs;
	}
	
	@Override
	public boolean createmenu(Integer idMenu, Integer idEmployee){
		return false;
	}
	
	@Override
	public boolean deletemenu(Integer idMenu, Integer idEmployee){
		return false;
	}
}
