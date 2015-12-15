package cr.ulacit.dao;


import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Menu;
/*Interfaz del Menu tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: MenuDaoImpl
 */
public interface MenuDao extends GenericDao<Menu,Integer> {
	
	public void findMenuByID(Integer id);
	
	
}
