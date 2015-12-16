package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Dish;
/*Interfaz del Dish tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishDaoImpl
 */
public interface DishDao extends GenericDao<Dish,Integer>{
	public List<Dish> findByName(String name);
	public List<Dish> findByIdDish(Integer id);
	
	public void createDish(String name, String size, String description);
	public void getDish(Integer id);
	public void updateDish(Integer id,String name, String size, String description);
	public void deleteDish(Integer id);
}

