package cr.ulacit.daoImpl;


import java.util.List;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import cr.ulacit.dao.DishDao;
import cr.ulacit.model.Dish;

/*Implementación de la interfaz del DishDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishDao
 */
@Repository("dishDao")
public class DishDaoImpl extends GenericDaoHibernate<Dish, Integer> implements DishDao {
	
	public DishDaoImpl() {
		super(Dish.class);
	}
	
	/*@Param: String name
	 *@Return: List<Dish>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> findByName(String name) {
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("name",name)).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> findByIdDish(Integer id) {
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("id_dish",id)).list();
	}
	
	/*Este método tiene como función crear un nuevo platillo 
	 *@Param: String name, nombre del platillo
	 *@Param: Integer size, tamaño del platillo
	 *@Param: String description, descripción del platillo
	 */
	@Override
	public void createDish(String name, String size, String description) {
		Dish dish = new Dish();
		Integer id= 0;
		id=dish.getId_dish()+1;
		if(id!=dish.getId_dish()){
			dish.setId_dish(id);
			dish.setName(name);
			dish.setSize(size);
			dish.setDescription(description);
			dish.setTimesserved(01112015);
			this.save(dish);
		System.out.println("New Dish"+dish.getName()+","+dish.getSize()+","+dish.getDescription()+dish.getTimesserved());
		
		}//else		//System.out.println("Error dish already exist");
			
	}
		
	/*Este método tiene como función obtener un platillo específico mediante su identificador único 
	 *@Param: Integer id, identificador del platillo
	 */
	@Override
	public void getDish(Integer id) {
	Dish dish = new Dish();
	if(dish.getId_dish()!=id){
		//System.out.println();
	}//else	
		System.out.println("Dish Info:" +this.get(id));
	}
	/*Este método tiene como función actualizar un platillo
	 *@Param: Integer idDish, identificador del platillo
	 *@Param: String name, nombre del platillo
	 *@Param: String size, tamaño del platillo
	 *@Param: String description, descripción del platillo
	 */
	@Override
	public void updateDish(Integer id,String name, String size, String description) {
	       Dish dish=new Dish();
	       if(dish.getId_dish()!=id){
	    	 //  System.out.println(); 
	       }else
	    	   dish.setId_dish(id);
	    	   dish.setName(name);
	    	  dish.setSize(size); 
	    	  dish.setDescription(description);
	    	  this.save(dish);
	    	  System.out.println("Dish Update:"+dish.getName()+", Description"+dish.getDescription()+
	    			  ", Size"+dish.getSize());
 	  
	       }

	@Override
	public void deleteDish(Integer id) {
		Dish dish=new Dish();
		 if(dish.getId_dish()!=id){
	    	 //  System.out.println(); 
	       }else
	    	   this.remove(id);
	}

	

}
