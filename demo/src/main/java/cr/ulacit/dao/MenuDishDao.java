package cr.ulacit.dao;



import org.appfuse.dao.GenericDao;

import cr.ulacit.model.MenuDish;
/*Interfaz del MenuDish tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: MenuDishDaoImpl
 */
public interface MenuDishDao extends GenericDao<MenuDish,Integer>{
	public void getMenu(Integer id_menudish);
}
