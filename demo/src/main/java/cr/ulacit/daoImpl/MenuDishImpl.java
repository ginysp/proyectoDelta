package cr.ulacit.daoImpl;



import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.MenuDishDao;
import cr.ulacit.model.MenuDish;
/*Implementación de la interfaz del MenuDishDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Repository("menuDishDao")
public class MenuDishImpl extends GenericDaoHibernate<MenuDish,Integer> implements MenuDishDao{

	public MenuDishImpl() {
		super(MenuDish.class);
	}

	@Override
	public void getMenu(Integer id_menudish) {
		MenuDish menu= new MenuDish();
		if(menu.getId_menudish()!=id_menudish){
			}
		System.out.println("Menu Info"+this.get(id_menudish));
		
	}
	
	

}
