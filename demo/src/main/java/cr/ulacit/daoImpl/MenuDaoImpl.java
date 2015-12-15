package cr.ulacit.daoImpl;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;
import cr.ulacit.dao.MenuDao;
import cr.ulacit.model.Menu;
/*Implementación de la interfaz del MenuDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Repository("menuDao")
public class MenuDaoImpl extends GenericDaoHibernate<Menu,Integer> implements MenuDao{

	public MenuDaoImpl() {
		super(Menu.class);
	}

	@Override
	public void findMenuByID(Integer id) {
		Menu menu= new Menu();
		if(menu.getId_menu()!=id){
		}
		System.out.println("Menu info:"+menu.toString());
		
		
	}
	

}
