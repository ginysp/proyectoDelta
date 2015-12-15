package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.IngredientsDao;
import cr.ulacit.model.Ingredients;
/*Implementación de la interfaz del IngredientsDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Repository("ingredientsDao")
public class IngredientsDaoImpl extends GenericDaoHibernate<Ingredients,Integer> implements IngredientsDao{

	public IngredientsDaoImpl() {
		super(Ingredients.class);
	}
	/*@Param: Integer id
	 *@Return: List<Ingredients>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Ingredients> findById(Integer id) {
		return getSession().createCriteria(Ingredients.class).add(Restrictions.eq("id_ingredients",id)).list();
	}
	/*@Param: String name
	 *@Return: List<Ingredients>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Ingredients> findByName(String name) {
		return getSession().createCriteria(Ingredients.class).add(Restrictions.eq("name",name)).list();
	}
	@Override
	public void createIngredients(String name, Integer calories) {
		Ingredients ing = new Ingredients();
		Integer id=0;
		id=ing.getId_ingredient()+1;
		if(id!=ing.getId_ingredient()){
			ing.setName(name);
			ing.setCalories(calories);
			this.save(ing);
			System.out.println("New Ingredients:"+ing.toString());
		}
		
	}
	@Override
	public void getIngredients(String name) {
		Ingredients ing = new Ingredients();
		if(ing.getName()!=name){	
		}
		System.out.println("Ingredient Info:"+ing.getName()+ing.getCalories());
	}
	@Override
	public void updateIngredients(String name, Integer calories) {
		Ingredients ing = new Ingredients();
		if(ing.getName()!=name){	
		}
		ing.setName(name);
		ing.setCalories(calories);
		this.save(ing);
		System.out.println("Ingredients update: "+ing.getName()+ing.getCalories());
	}
	@Override
	public void deleteIngredients(Integer id) {
		Ingredients ing = new Ingredients();
		if(ing.getId_ingredient()!=id){	
		}
		this.remove(id);
	}

}
