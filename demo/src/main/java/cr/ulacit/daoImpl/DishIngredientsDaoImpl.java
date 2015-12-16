package cr.ulacit.daoImpl;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
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
	
	@Override
	public void getDishIngredients(Integer id_dishingredients) {
		DishIngredients dishIngre= new DishIngredients();
		if(id_dishingredients!=dishIngre.getId_dishingredients()){
			}
			System.out.println("Id:"+this.get(id_dishingredients));
		}


	
	
	



}
