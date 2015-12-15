package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.Ingredients;

/*Interfaz del Ingredients tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: IngredientsDaoImpl
 */
public interface IngredientsDao extends GenericDao<Ingredients,Integer> {
	public List<Ingredients> findById(Integer id);
	public List<Ingredients> findByName(String name);
	
	public void createIngredients(String name, Integer calories);
	public void getIngredients(String name);
	public void updateIngredients(String name, Integer calories);
	public void deleteIngredients(Integer id);
}

