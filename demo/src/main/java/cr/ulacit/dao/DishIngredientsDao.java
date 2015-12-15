package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import cr.ulacit.model.DishIngredients;

/*Interfaz del DishIngredients tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishIngredientsDaoImpl
 */
public interface DishIngredientsDao extends GenericDao<DishIngredients,Integer>{
	
	
	public double totalCalories(List<Double> list);
	List<Double> findCaloriesByIdDish(Integer dishid_dish);
	
	
	public void getDishIngredients(Integer id_dishingredients); 
	
}
