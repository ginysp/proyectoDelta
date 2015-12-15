package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.DishIngredientsDao;
import cr.ulacit.model.DishIngredients;
/*Implementación de la interfaz del DishIngredientsDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Repository("dishIngredientsDao")
public class DishIngredientsDaoImpl extends GenericDaoHibernate<DishIngredients,Integer> implements DishIngredientsDao {

	public DishIngredientsDaoImpl() {
		super(DishIngredients.class);
	}
	
	/*
	/*@Param: Integer dish_id
	 *@Return: List<DishIngredients>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Double> findCaloriesByIdDish(Integer dishid_dish) {
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("dishid_dish",dishid_dish)).list();
	}
	/*@Param: List<Double> listCalories
	 *@Return: double
	 */
	@Override
	public double totalCalories(List<Double> listCalories) {
		return getSession().createCriteria(DishIngredients.class).add(Restrictions.eq("list",listCalories)).list().size();
	}
	/* Metodo para obtener el dish ingredients mediante su identificador único
	 * @Param: Integer id_dishingredients, identificador único 
	 */
	@Override
	public void getDishIngredients(Integer id_dishingredients) {
		DishIngredients dishIngre= new DishIngredients();
		if(id_dishingredients!=dishIngre.getId_dishingredients()){
			}
			System.out.println("Id:"+this.get(id_dishingredients));
		}



}
